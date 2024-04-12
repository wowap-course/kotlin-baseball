package baseball.domain

import baseball.domain.numbergenerator.NumberGenerator

class Referee() {
    fun refereeNumber(answer : String) : Pair<Int, Int> {
        val number = opponent.number
        var ball = 0
        var strike = 0
        answer.forEachIndexed { index, c ->
            if(c == number[index]) strike++
            else if(c in number) ball++
        }
        return ball to strike
    }
    companion object {
        private const val DigitsRule = 3
    }
}