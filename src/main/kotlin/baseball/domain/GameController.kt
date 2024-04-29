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
            val validAnswer = getValidateAnswer()
            val (ball, strike) = Judgement().judgeNumber(opponentNumber, validAnswer)
            endCondition = strike
            outputView.printResultOfInning(ball, strike)
        }
        outputView.printResultOfBaseBall()
    }
    private fun getValidateAnswer() : List<Int> {
        var answer = getAnswer()
        while(answer == null) answer = getAnswer()
        val validAnswer = validate(answer)
        return validAnswer
    }
    private fun getAnswer() : String? {
        val answer = inputView.readAnswer()
        val validInput = ValidInput()
        return runCatching {
            validInput.isNumber(answer)
            validInput.isThreeDigits(answer)
            validInput.isNoDuplicate(answer)
            answer
        }.onFailure { e ->
            println(e.message)
        }.getOrNull()
    }
    private fun validate(answer : String) : List<Int> = answer.toList().map { it.toString().toInt() }
    companion object {
        private const val START = 1
        private const val INIT_CONDITION = 0
        private const val END_CONDITION = 3
    }
}