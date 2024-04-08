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
        outputView.endBaseballPlay()
        decideMoreOrStop()
    }

    private fun baseballPlay(answer: List<Int>) {
        var strike = INIT_NUMBER
        var ball = INIT_NUMBER
        while (strike != END_GAME_CONDITION) {
            val input = inputView.inputNumber()
            if (isWrongInput(input)) continue
            val convertedInput = input.toString().map { it.toString().toInt() }
            strike = judge.calculateStrike(convertedInput, answer)
            ball = judge.calculateBall(convertedInput, answer)
            printResult(strike, ball)
        }
    }

    private fun decideMoreOrStop() {
        val command = inputCommand()
        if (command == MORE_GAME_COMMAND) {
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

    private fun inputCommand(): Int {
        val command = inputView.printDecideMoreOrStop()
        if(InputChecker().isWrongMoreOrStopCommand(command)) {
            decideMoreOrStop()
        }
        return command!!.toInt()
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