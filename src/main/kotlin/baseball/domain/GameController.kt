package baseball.domain

import baseball.domain.numbergenerator.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class GameController(
    private val inputView : InputView,
    private val outputView: OutputView,
) {
    fun start(){
        outputView.printGameStart()
        var startOrQuit = START
        while(startOrQuit == START){ //startOrQuit 이 Quit 될 때까지
            run()
            startOrQuit = inputView.readStartOrQuit()
        }
    }
    private fun run(){
        val opponentNumber = RandomNumberGenerator().generateNumber()
        var endCondition = INIT_CONDITION
        while(endCondition != END_CONDITION) {
            val validAnswer = validate(inputView.readAnswer())
            val (ball, strike) = Judgement().judgeNumber(opponentNumber, validAnswer)
            endCondition = strike
            outputView.printResultOfInning(ball, strike)
        }
        outputView.printResultOfBaseBall()
    }

    private fun validate(answer : List<Int>) : List<BaseballNumber> {
        return answer.map { BaseballNumber(it) }
    }

    companion object {
        private const val START = 1
        private const val INIT_CONDITION = 0
        private const val END_CONDITION = 3
    }
}
