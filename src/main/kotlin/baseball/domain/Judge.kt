package baseball.domain

class Judge {
    fun calculateStrike(inputNum: List<Int>, answer: List<Int>): Int {
        return inputNum.zip(answer).count { it.first == it.second }
    }

    fun calculateBall(inputNum: List<Int>, answer: List<Int>): Int {
        return inputNum.count { it in answer && it != answer[inputNum.indexOf(it)] }
    }
}