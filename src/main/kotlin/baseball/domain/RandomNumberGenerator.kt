package baseball.domain

class RandomNumberGenerator {
    fun randomNumberGenerate(): List<Int> {
        val numbers = mutableListOf<Int>()
        while (numbers.distinct().size < NUMBER_LENGTH) {
            numbers.add((MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random())
        }
        return numbers
    }

    companion object {
        const val MIN_RANDOM_NUMBER = 1
        const val MAX_RANDOM_NUMBER = 9
        const val NUMBER_LENGTH = 3
    }
}