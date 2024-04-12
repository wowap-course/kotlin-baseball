package baseball.domain.numbergenerator

interface NumberGenerator {
    fun getNumbers(): MutableList<Int>
}