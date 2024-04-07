package baseball.domain

class Judge {
    fun calculateStrike(inputNum: List<Int>, answer: List<Int>): Int {
        return inputNum.indices.count { inputNum[it] == answer[it] }
    }

    fun calculateBall(inputNum: List<Int>, answer: List<Int>): Int {
        return inputNum.count { it in answer && it != answer[inputNum.indexOf(it)] }
    }
}