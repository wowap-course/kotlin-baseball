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
        while(){ //startOrQuit 이 Quit 될 때까지
            run()
        }
    }
    fun run(){
        val judgement = Judgement()
        val opponentNumber = RandomNumberGenerator().generateNumber()
        var startOrQuit = 1

        while(startOrQuit == 1) {
            var answer = getAnswer()
            while(answer == null) answer = getAnswer()
            val validAnswer = validate(answer)
            val (ball, strike) = Judgement().judgeNumber(opponentNumber, validAnswer)
            outputView.printResultOfInning(ball, strike)
        }

        outputView.printResultOfBaseBall()
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
}