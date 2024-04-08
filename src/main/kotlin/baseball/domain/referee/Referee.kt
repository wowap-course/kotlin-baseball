package baseball.domain.referee

import baseball.domain.digitsrule.DigitsRule
import baseball.domain.numbergenerator.NumberGenerator

class Referee(
    private val numberGenerator: NumberGenerator,
    private val digitsRule: DigitsRule,
    ) {
    fun makeNumber() : String {
        val number = numberGenerator.get()
        val rule = digitsRule.setDigits(number)
        require(number.toSet().size == number.length)
        require(rule)
        return number
    }
}