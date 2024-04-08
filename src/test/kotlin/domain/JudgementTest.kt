package domain

import org.junit.jupiter.api.Test

class JudgementTest {

    @Test
    fun `스트라이크, 볼, 나싱의 힌트를 표시한다`(){
        var strikeCount:Int = 0
        var ballCount:Int = 0
        val randomBaseBallNumber:List<Int> = listOf(4,5,6)
        val inputBaseBallNumber:List<Int> = listOf(5,7,6)

        for ( i in randomBaseBallNumber.indices) {
            strikeCount = checkStrike(i, randomBaseBallNumber, inputBaseBallNumber, strikeCount)
        }
        randomBaseBallNumber.forEach{
            ballCount = checkBall(it, randomBaseBallNumber, ballCount)
        }
        println("스트라이크 : ${strikeCount}")
        println("볼 : ${ballCount - strikeCount}")
    }
    private fun checkStrike(
        i:Int,
        randomBaseBallNumber:List<Int>,
        inputBaseBallNumber:List<Int>,
        strikeCount:Int
    ):Int{
        var strikeCount1 = strikeCount
        if (inputBaseBallNumber[i] == randomBaseBallNumber[i]) strikeCount1++
        return strikeCount1
    }

    private fun checkBall(
        it:Int,
        randomBaseBallNumber: List<Int>,
        ballCount:Int
    ):Int{
        var ballCount1 = ballCount
        if (it in randomBaseBallNumber) ballCount1++
        return ballCount1
    }
    @Test
    fun `게임을 종료한후 게임을 다시 시작한거나 완전히 종료 할수 있다`(){
        // Game Controller Test -> 미션 제출 조건 X
    }
}