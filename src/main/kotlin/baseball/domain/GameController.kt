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
        val opponentNumber = BaseballNumbers(RandomNumberGenerator().generateNumber()).baseballNumbers
        var answer = BaseballNumbers(inputView.readAnswer()).baseballNumbers
        while(opponentNumber == answer) {
            answer = BaseballNumbers(inputView.readAnswer()).baseballNumbers
            val (ball, strike) = Judgement().judgeNumber(opponentNumber, answer)
            outputView.printResultOfInning(ball, strike)
        }
        outputView.printResultOfBaseBall()
    }

    companion object {
        private const val START = 1
    }
}