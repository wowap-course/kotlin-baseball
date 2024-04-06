package baseball.domain.computer

class Computer {
    var number = mutableListOf<Int>()


    companion object {
        const val MIN_RANDOM_NUMBER = 1
        const val MAX_RANDOM_NUMBER = 9
        const val THREE_STRIKE = 3
        const val RESET_NUMBER = 0
    }
}