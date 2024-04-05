package baseball.domain.player

import baseball.domain.computer.GameSetup

class Game {
    private val gameSetup = GameSetup()

    fun playGame() {
        val computer = gameSetup.generateRandomNumber()
        val player =  selectNumber()

        var strike = 0
        var ball = 0

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
    }

    private fun selectNumber(): List<Int> {
        val inputNumber = mutableListOf<Int>()

        print("숫자를 입력하세요: ")
        val input = readlnOrNull() ?: ""
        val numbers = input.map { it.toString().toIntOrNull() }

        for (num in numbers) {
            if (num != null) {
                inputNumber.add(num)
            }
        }

        return inputNumber
    }


}