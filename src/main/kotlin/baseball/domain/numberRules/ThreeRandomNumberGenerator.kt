package baseball.domain.numberRules

import baseball.domain.computer.Computer.Companion.MAX_COM_NUMBER_SIZE
import baseball.domain.computer.Computer.Companion.MAX_RANDOM_NUMBER
import baseball.domain.computer.Computer.Companion.MIN_RANDOM_NUMBER

class ThreeRandomNumberGenerator : ComputerGenerateNumberRule {
    override fun generateRandomNumber(): List<Int> {
        val randomNumbers = mutableListOf<Int>()

        while (randomNumbers.distinct().size < MAX_COM_NUMBER_SIZE) {
            randomNumbers.add((MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random())
        }

        println(randomNumbers)
        return randomNumbers
    }
}