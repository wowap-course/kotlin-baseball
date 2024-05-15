package baseball.domain.numberRules

interface PlayerSelectNumberRule {
    fun selectNumber(input: String): List<Int>
}