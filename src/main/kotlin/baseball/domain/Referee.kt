package baseball.domain

import baseball.domain.numbergenerator.NumberGenerator

class Referee(
    private val numberGenerator: NumberGenerator,
    private val digitsRule: DigitsRule,
    ) {
    fun makeNumber() : String {
        val number = numberGenerator.get()
        val rule = digitsRule.setDigits(number)
        require(rule)
        require(number.toSet().size == number.length)
        return number
    }
    fun refereeNumber(opponent : Opponent, answer : String) : Pair<Int, Int> {
        val number = opponent.number
        var ball = 0
        var strike = 0
        answer.forEachIndexed { index, c ->
            if(c == number[index]) strike++
            else if(c in number) ball++
        }
        return ball to strike
    }
}