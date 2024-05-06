package baseball.domain

import baseball.domain.numbergenerator.NumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JudgementTest () {
    inner class FixedNumberGenerator : NumberGenerator {
        override fun generateNumber() = listOf(BaseballNumber(1), BaseballNumber(2), BaseballNumber(3))
    }
    @Test
    fun `입력한 수에 대해 '볼'을 판단할 수 있다`() {
        val opponentNumber = FixedNumberGenerator().generateNumber()
        val answer = listOf(BaseballNumber(3), BaseballNumber(4), BaseballNumber(5))
        val (ball, _) = Judgement().judgeNumber(opponentNumber, answer)
        assertThat(ball).isEqualTo(1)
    }
    @Test
    fun `입력한 수에 대해 '스트라이크'를 판단할 수 있다`() {
        val opponentNumber = FixedNumberGenerator().generateNumber()
        val answer = listOf(BaseballNumber(1), BaseballNumber(2), BaseballNumber(5))
        val (_, strike) = Judgement().judgeNumber(opponentNumber, answer)
        assertThat(strike).isEqualTo(2)
    }
    @Test
    fun `입력한 수에 대해 '볼'과 '스트라이크'를 판단할 수 있다`() {
        val opponentNumber = FixedNumberGenerator().generateNumber()
        val answer = listOf(BaseballNumber(1), BaseballNumber(3), BaseballNumber(2))
        val (ball, strike) = Judgement().judgeNumber(opponentNumber, answer)
        assertThat(ball to strike).isEqualTo(2 to 1)
    }
}
