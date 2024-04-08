package baseball.domain.digitsrule

class DigitsRule(private val rule : Int) {
    fun setDigits(number: String): Boolean {
        return number.length == rule
    }
}