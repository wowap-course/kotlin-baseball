package baseball.domain

class RandomNumberGenerator {
    fun numberGenerate(): List<Int> {
        val numbers = mutableListOf<Int>()
        while (!checkRandomNumberSize(numbers)) {
            numbers.add((MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random())
            numbers.toSet()
        }
        return numbers
    }

    fun checkRandomNumberSize(numbers: List<Int>): Boolean = (numbers.size == NUMBER_LENGTH)

    companion object {
        const val MIN_RANDOM_NUMBER = 1
        const val MAX_RANDOM_NUMBER = 9
        const val NUMBER_LENGTH = 3
    }
}