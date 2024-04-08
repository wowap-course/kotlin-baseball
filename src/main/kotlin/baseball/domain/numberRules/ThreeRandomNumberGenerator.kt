package baseball.domain.numberRules

import baseball.domain.computer.Computer
import baseball.domain.computer.Computer.Companion.MAX_COM_NUMBER_SIZE
import baseball.domain.computer.Computer.Companion.MAX_RANDOM_NUMBER
import baseball.domain.computer.Computer.Companion.MIN_RANDOM_NUMBER

class ThreeRandomNumberGenerator : ComputerGenerateNumberRule {
    override fun generateRandomNumber(): MutableList<Int> {
        val computer = Computer()

        while (computer.number.size < MAX_COM_NUMBER_SIZE) {
            val randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
            if (!computer.number.contains(randomNumber)) {
                computer.number.add(randomNumber)
            }
        }

        println(computer.number)
        return computer.number
    }
}