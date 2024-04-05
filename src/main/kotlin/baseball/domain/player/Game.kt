package baseball.domain.player

import baseball.domain.computer.GameSetup
import baseball.view.InputView
import baseball.view.OutputView

class Game {
    private val gameSetup = GameSetup()
    private val inputview = InputView()
    private val outputview = OutputView()

    fun playGame() {
        val computer = gameSetup.generateRandomNumber()

        var strike = 0
        var ball = 0

        while (!isTreeStrike(strike)) {
            val player =  selectNumber()

            for (i in computer.indices) {
                if (computer[i] == player[i]) {
                    strike++
                } else if (player.contains(computer[i])) {
                    ball++
                }
            }

            outputview.printGameResult(strike, ball)

            if (strike != 3) {
                strike = 0
                ball = 0
            }
        }

        outputview.printWin()
    }

    private fun selectNumber(): List<Int> {
        val inputNumber = mutableListOf<Int>()

        inputview.printInputNumber()
        val input = readlnOrNull() ?: ""
        val numbers = input.map { it.toString().toIntOrNull() }

        for (num in numbers) {
            if (num != null) {
                inputNumber.add(num)
            }
        }

        return inputNumber
    }

    private fun isTreeStrike(strike: Int): Boolean {
        return strike == 3
    }

}