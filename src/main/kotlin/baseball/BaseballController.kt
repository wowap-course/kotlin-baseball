package baseball

import baseball.domain.InputChecker
import baseball.domain.Judge
import baseball.domain.numbergenerator.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class BaseballController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private val judge = Judge()

    fun run() {
        println("숫자 야구 게임을 시작합니다.")
        startBaseball()
    }

    private fun startBaseball() {
        playBaseball(RandomNumberGenerator().generateNumber())
        outputView.endBaseballPlay()
        decideMoreOrStop()
    }

    private fun playBaseball(answer: List<Int>) {
        var strike = INIT_NUMBER
        var ball = INIT_NUMBER
        while (strike != END_GAME_STRIKE_CONDITION) {
            val input = inputView.inputGuessedNumber()
            if (InputChecker().isWrongGuessedNumberInput(input)) continue
            val convertedInput = input.toString().map { it.toString().toInt() }
            strike = judge.calculateStrike(convertedInput, answer)
            ball = judge.calculateBall(convertedInput, answer)
            printResult(strike, ball)
        }
    }

    private fun decideMoreOrStop() {
        val command = inputMoreOrStopCommand()
        if (command == MORE_GAME_COMMAND) {
            startBaseball()
        }
    }

    private fun printResult(strike: Int, ball: Int) {
        when {
            (strike == NOT_COUNTED && ball == NOT_COUNTED) -> outputView.printNothing()
            (ball == NOT_COUNTED) -> outputView.printStrikeOnly(strike)
            (strike == NOT_COUNTED) -> outputView.printBallOnly(ball)
            else -> outputView.printBallAndStrike(strike, ball)
        }
    }

    private fun inputMoreOrStopCommand(): Int {
        val command = inputView.printDecideMoreOrStop()
        if (InputChecker().isWrongMoreOrStopCommand(command)) {
            decideMoreOrStop()
        }
        return command!!.toInt()
    }

    companion object {
        const val NOT_COUNTED = 0
        const val INIT_NUMBER = 0
        const val END_GAME_STRIKE_CONDITION = 3
        const val MORE_GAME_COMMAND = 1
    }
}