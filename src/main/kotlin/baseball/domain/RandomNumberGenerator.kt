package baseball.domain

class RandomNumberGenerator {

    fun checkRandomNumberSize(numbers: List<Int>) : Boolean = (numbers.size == NUMBER_LENGTH)

    companion object {
        const val MIN_RANDOM_NUMBER = 1
        const val MAX_RANDOM_NUMBER = 9
        const val NUMBER_LENGTH = 3
    }
}