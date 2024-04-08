package baseball.domain.numbergenerator

class RandomNumberGenerator : NumberGenerator  {
    override fun get(): String {
        val number = mutableSetOf<Int>()
        while(number.size < MAX_NUMBER_LENGTH) {
            number.add((MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random())
        }
        return number.toString()
    }

    companion object {
        private const val MIN_RANDOM_NUMBER = 1
        private const val MAX_RANDOM_NUMBER = 9
        private const val MAX_NUMBER_LENGTH = 4
    }
}