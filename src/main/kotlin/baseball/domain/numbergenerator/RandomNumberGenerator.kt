package baseball.domain.numbergenerator

class RandomNumberGenerator : NumberGenerator {
    override fun get(): String {
        var number = ""
        number += (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random().toString()
        number += (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random().toString()
        number += (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random().toString()
        return number
    }

    companion object {
        private const val MIN_RANDOM_NUMBER = 1
        private const val MAX_RANDOM_NUMBER = 9
    }
}