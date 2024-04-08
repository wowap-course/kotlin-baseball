package baseball.domain.numberRules

interface ComputerGenerateNumberRule {
    fun generateRandomNumber(): MutableList<Int>
}