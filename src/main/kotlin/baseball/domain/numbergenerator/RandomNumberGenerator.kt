package baseball.domain.numbergenerator

import baseball.domain.digitsrule.DigitsRule

class RandomNumberGenerator : NumberGenerator  {
    override fun get(): String {
        val number = mutableSetOf<Int>()
        while(number.size < 4) {
            number.add((MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random())
        }
        return number.toString()
    }

    companion object {
        private const val MIN_RANDOM_NUMBER = 1
        private const val MAX_RANDOM_NUMBER = 9
    }
}