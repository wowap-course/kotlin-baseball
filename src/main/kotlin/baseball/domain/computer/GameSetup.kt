package baseball.domain.computer

import baseball.domain.computer.Computer.Companion.MAX_RANDOM_NUMBER
import baseball.domain.computer.Computer.Companion.MIN_RANDOM_NUMBER

class GameSetup {

    fun generateRandomNumber(): MutableList<Int> {
        val computer = Computer()

        repeat(3) {
            val randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
            if (!computer.number.contains(randomNumber)) {
                computer.number.add(randomNumber)
            }
        }

        return computer.number
    }
}