package baseball.domain.host

import baseball.domain.digitsrule.DigitsRule
import baseball.domain.numbergenerator.NumberGenerator
import baseball.domain.numbergenerator.RandomNumberGenerator

class Host(
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