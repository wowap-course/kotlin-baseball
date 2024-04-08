package baseball.domain.referee

import baseball.domain.digitsrule.DigitsRule
import baseball.domain.numbergenerator.NumberGenerator

class Referee(
    private val numberGenerator: NumberGenerator,
    private val digitsRule: DigitsRule,
    ) {
    fun makeNumber() : String {
        val number : String = numberGenerator.get()
        val rule = digitsRule.setDigits(number)
        require(number.toSet().size == number.length)
        require(rule)
        return number
    }
    fun refereeNumber(answer : String) : String {
        val number : String = numberGenerator.get()
        if((answer + number).toSet().size == answer.length * 2) return "낫싱"
        return "ball"
    }
}