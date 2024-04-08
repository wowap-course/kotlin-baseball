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
        var ball = 0
        var strike = 0
        answer.forEachIndexed { index, c ->
            if(c == number[index]) strike++
            else if(c in number) ball++
        }
        var result = ""
        if(ball != 0) result += "${ball}볼"
        if(strike != 0) result += " ${strike}스트라이크"
        return result.trim()
    }
}