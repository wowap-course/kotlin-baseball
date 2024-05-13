package baseball

import baseball.domain.Referee
import baseball.domain.numberRules.UserInputNumbers
import baseball.domain.numberRules.ThreeRandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class GameController {
    private val gameSetup = ThreeRandomNumberGenerator()
    private val seletNumber = UserInputNumbers()
    private val outputview = OutputView()
    private val inputview = InputView()
    private val referee = Referee()

    fun playGame() {
        outputview.printStartGame()
        val computer = gameSetup.generateRandomNumber()

        while (!referee.isThreeStrike()) {
            val input = inputview.getInputNumbers()
            val player = seletNumber.selectNumber(input)

            playHandler(computer, player)
        }

        outputview.printWin()
    }

    private fun checkNumber(inputs: List<Int>): List<Int> {
        if (inputs.size != 3) {
            throw IllegalArgumentException("입력한 숫자는 3개가 아닙니다.")
        }
        return inputs
    }

    private fun playHandler(computer: List<Int>, player: List<Int>): Boolean {
        return try {
            val validPlayer = checkNumber(player)
            val (strike, ball) = referee.call(computer, validPlayer)
            referee.reset()
            outputview.printGameResult(strike, ball)
            true
        } catch (e: IllegalArgumentException) {
            println(e.message)
            false
        }
    }

}