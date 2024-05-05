package baseball.domain.numbergenerator

import baseball.domain.BaseballNumber

class RandomNumberGenerator : NumberGenerator  {
    override fun generateNumber(): List<BaseballNumber> {
        val number = mutableSetOf<BaseballNumber>()
        while(number.size < NUMBER_DIGITS) {
            val randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
            number.add(BaseballNumber(randomNumber))
        }
        return number.toList()
    }

    companion object {
        private const val MIN_RANDOM_NUMBER = 1
        private const val MAX_RANDOM_NUMBER = 9
        private const val NUMBER_DIGITS = 3
    }
}