package baseball.domain


import baseball.view.InputView
import baseball.view.OutputView

class BaseballController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private val judge = Judge()

    fun run() {
        println("숫자 야구 게임을 시작합니다.")
        baseballStart()
    }

    private fun baseballStart() {
        baseballPlay(RandomNumberGenerator().randomNumberGenerate())
        decideMoreOrStop()
    }


    private fun baseballPlay(answer: List<Int>) {
        var strike = INIT_NUMBER
        var ball = INIT_NUMBER
        while (strike != END_GAME_CONDITION) {
            val input = inputUserNumber(answer)
            strike = judge.calculateStrike(input, answer)
            ball = judge.calculateBall(input, answer)
            printResult(strike, ball)
        }
        outputView.endBaseballPlay()
    }

    private fun inputUserNumber(answer: List<Int>): List<Int> {
        val input = inputView.inputNumber()
        try {
            require(input != null) { "[ERROR] 입력이 잘못되었습니다." }
            val convertedInput = input.toString().map { it.toString().toInt() }
            require(convertedInput.toSet().size == convertedInput.size) { "[ERROR] 중복된 숫자 입력" }
        } catch (e: IllegalArgumentException) {
            println(e.message)
            baseballPlay(answer)
        }
        return input.toString().map { it.toString().toInt() }
    }

    private fun decideMoreOrStop() {
        val command = inputCommand()
        if(command == MORE_GAME_COMMAND) {
            baseballStart()
        }
    }

    private fun printResult(strike: Int, ball: Int) {
        when {
            strike == NOT_COUNTED && ball == NOT_COUNTED -> outputView.printNothing()
            (ball == NOT_COUNTED) -> outputView.printStrikeOnly(strike)
            (strike == NOT_COUNTED) -> outputView.printBallOnly(ball)
            else -> outputView.printBallAndStrike(strike, ball)
        }
    }


    companion object {
        const val NOT_COUNTED = 0
        const val INIT_NUMBER = 0
        const val MAX_INPUT_LENGTH = 3
        const val END_GAME_CONDITION = 3
        const val MORE_GAME_COMMAND = 1
        const val END_GAME_COMMAND = 2
    }
}