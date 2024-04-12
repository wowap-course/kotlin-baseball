package baseball.domain

class Judgement() {
    fun judgeNumber(opponentNumber : List<Int>, answer : List<Int>) : Pair<Int, Int> {
        val strike = countStrikes(opponentNumber, answer)
        val allBall = countAllBall(opponentNumber, answer)
        val ball = allBall - strike
        return ball to strike
    }
    private fun countAllBall(opponentNumber: List<Int>, answer: List<Int>) : Int =
        opponentNumber.count { answer.contains(it) }

    private fun countStrikes(opponentNumber : List<Int>, answer : List<Int>) : Int =
        opponentNumber.zip(answer).count { it.first == it.second }
}