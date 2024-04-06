package baseball.domain.player

import baseball.domain.computer.Computer.Companion.RESET_NUMBER
import baseball.domain.computer.Computer.Companion.THREE_STRIKE
import baseball.domain.computer.GameSetup
import baseball.domain.computer.Referee
import baseball.view.InputView
import baseball.view.OutputView

class Game {
    private val gameSetup = GameSetup()
    private val inputview = InputView()
    private val outputview = OutputView()
    private val referee = Referee()


    fun playGame() {
        val computer = gameSetup.generateRandomNumber()

        while (!isThreeStrike(referee.strike)) {
            val player =  selectNumber()

            val (strike, ball) = referee.call(computer, player)

            outputview.printGameResult(strike, ball)
            referee.reset()

        }

        outputview.printWin()
    }

    private fun selectNumber(): List<Int> {
        val inputNumber = mutableListOf<Int>()

        val input = inputview.printInputNumber()
        val numbers = input.map { it.toString().toIntOrNull() }

        for (num in numbers) {
            if (num != null) {
                inputNumber.add(num)
            }
        }

        return inputNumber
    }

    private fun isThreeStrike(strike: Int): Boolean {
        return strike == THREE_STRIKE
    }
}