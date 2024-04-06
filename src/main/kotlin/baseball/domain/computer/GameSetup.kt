package baseball.domain.computer

import baseball.domain.computer.Computer.Companion.MAX_RANDOM_NUMBER
import baseball.domain.computer.Computer.Companion.MIN_RANDOM_NUMBER

class GameSetup {

    fun generateRandomNumber(): MutableList<Int> {
        val computer = Computer()

        while (computer.number.size < 3) {
            val randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
            if (!computer.number.contains(randomNumber)) {
                computer.number.add(randomNumber)
            }
        }

        println(computer.number)
        return computer.number
    }
}