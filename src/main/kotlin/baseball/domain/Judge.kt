package baseball.domain

class Judge {
    fun calculateStrike(number1: List<Int>, number2: List<Int>): Int {
        return number1.indices.count { number1[it] == number2[it] }
    }

    fun calculateBall(number1: List<Int>, number2: List<Int>): Int {
        return number1.count { it in number2 && it != number2[number1.indexOf(it)] }
    }
}