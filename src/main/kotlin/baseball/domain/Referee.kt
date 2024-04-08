package baseball.domain

import baseball.domain.numbergenerator.NumberGenerator

class Referee(
    private val opponent: Opponent,
    private val digitsRule: DigitsRule,
    ) {
    fun makeNumber() : String {
        val number = opponent.number
        val rule = digitsRule.setDigits(number)
        require(number.toSet().size == number.length)
        require(rule)
        return number
    }
    fun refereeNumber(answer : String) : String {
        val number = opponent.number
        var ball = 0
        var strike = 0
        answer.forEachIndexed { index, c ->
            if(c == number[index]) strike++
            else if(c in number) ball++
        }
        if(ball == 0 && strike == 0) return "낫싱"
        var result = if(ball != 0) "${ball}볼" else ""
        if(strike != 0) result += " ${strike}스트라이크"
        return result.trim()
    }
}