package baseball.domain.numberRules

interface ComputerGenerateNumberRule {
    fun generateRandomNumber(): List<Int>
}