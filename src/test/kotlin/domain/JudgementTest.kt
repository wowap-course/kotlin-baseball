package domain

import baseball.domain.Count
import baseball.domain.Judgement
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JudgementTest {

    @Test
    fun `스트라이크, 볼, 나싱의 힌트를 표시한다`(){
        val answerNumbers:List<Int> = listOf(4,5,6)
        val targetNumbers:List<Int> = listOf(5,1,6)
        val count = Judgement().correctCount(answerNumbers, targetNumbers)
        assertThat(count).isEqualTo(Count(1,1))
    }
    @Test
    fun `게임을 종료한후 게임을 다시 시작한거나 완전히 종료 할수 있다`(){
        // Game Controller Test -> 미션 제출 조건 X
    }
}