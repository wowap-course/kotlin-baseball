package domain

import baseball.domain.Referee
import baseball.domain.Judgement
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JudgementTest {

    @Test
    fun `스트라이크, 볼, 나싱의 힌트를 표시한다`(){
        val answerNumbers:List<Int> = listOf(4,5,6)
        val targetNumbers:List<Int> = listOf(5,1,6)
        val count = Judgement().correctCount(answerNumbers, targetNumbers)
        assertThat(count).isEqualTo(Referee(1,1))
    }
}