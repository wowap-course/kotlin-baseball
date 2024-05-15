package baseball.domain.numberRules

import baseball.domain.Referee.Companion.MAX_COM_NUMBER_SIZE
import baseball.domain.Referee.Companion.MAX_RANDOM_NUMBER
import baseball.domain.Referee.Companion.MIN_RANDOM_NUMBER

class ThreeRandomNumberGenerator : ComputerGenerateNumberRule {
    override fun generateNumber(): List<Int> {
        val randomNumbers = mutableListOf<Int>()

        while (randomNumbers.size < MAX_COM_NUMBER_SIZE) {
            val randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
            if (!randomNumbers.contains(randomNumber)) {
                randomNumbers.add(randomNumber)
            }
        }

        println(randomNumbers)
        return randomNumbers
    }
}