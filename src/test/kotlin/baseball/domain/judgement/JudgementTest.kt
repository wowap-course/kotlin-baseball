package baseball.domain.judgement

import baseball.domain.Judgement
import baseball.domain.numbergenerator.NumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JudgementTest () {
    inner class FakeNumberGenerator : NumberGenerator {
        override fun generateNumber(): List<Int> = listOf(1, 2, 3)
    }
    @Test
    fun `입력한 수에 대해 '볼'을 판단할 수 있다`() {
        val opponentNumber = FakeNumberGenerator().generateNumber()
        val (ball, _) = Judgement().judgeNumber(opponentNumber, listOf(3, 4, 5))
        assertThat(ball).isEqualTo(1)
    }
    @Test
    fun `입력한 수에 대해 '스트라이크'를 판단할 수 있다`() {
        val opponentNumber = FakeNumberGenerator().generateNumber()
        val (_, strike) = Judgement().judgeNumber(opponentNumber, listOf(1, 2, 5))
        assertThat(strike).isEqualTo(2)
    }
    @Test
    fun `입력한 수에 대해 '볼'과 '스트라이크'를 판단할 수 있다`() {
        val opponentNumber = FakeNumberGenerator().generateNumber()
        val (ball, strike) = Judgement().judgeNumber(opponentNumber, listOf(1, 3, 2))
        assertThat(ball to strike).isEqualTo(2 to 1)
    }
}
