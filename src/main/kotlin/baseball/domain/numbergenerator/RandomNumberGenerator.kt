package baseball.domain.numbergenerator

class RandomNumberGenerator : NumberGenerator {
    override fun getNumbers(): MutableList<Int> {
        var randomNumber = mutableListOf<Int>()
        randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).shuffled().take(MAX_GAME_SIZE).distinct().toMutableList()
        return randomNumber
    }

    companion object {
        private const val MAX_RANDOM_NUMBER = 9
        private const val MIN_RANDOM_NUMBER = 1
        private const val MAX_GAME_SIZE = 3
    }
}
