package baseball.domain.numbergenerator

class RandomNumberGenerator : NumberGenerator {
    override fun getNumber(): MutableList<Int> {
        val intRandomBaseballNumber: Int = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).random()
        val randomBaseballNumber = mutableListOf<Int>()
        intRandomBaseballNumber.toString().forEach { randomBaseballNumber.add(it.digitToInt()) }
        return randomBaseballNumber
    }

    companion object {
        private const val MAX_RANDOM_NUMBER = 999
        private const val MIN_RANDOM_NUMBER = 100
    }
}