package baseball.domain.player

import baseball.domain.computer.GameSetup
import baseball.view.InputView

class Game {
    private val gameSetup = GameSetup()
    private val inputview = InputView()

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

            when {
                strike > 0 && ball > 0 -> println("$strike 스트라이크 $ball 볼")
                strike > 0 -> println("$strike 스트라이크")
                ball > 0 -> println("$ball 볼")
                else -> println("낫딩")
            }
            if (strike != 3) {
                strike = 0
                ball = 0
            }
        }
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