package baseball.domain.numbergenerator

import baseball.domain.DigitsRule
import baseball.domain.Opponent
import baseball.domain.Referee
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class RandomNumberGeneratorTest {
    inner class FakeNumberGenerator : NumberGenerator {
        override fun get(): String {
            return "111"
        }
    }
    @Test
    fun `숫자는 정해진 자릿수가 있다`() {
        val referee = Referee(Opponent(RandomNumberGenerator()), DigitsRule(3))
        assertThat(referee.makeNumber().length).isEqualTo(3)
    }

    @Test
    fun `각각의 숫자는 서로 다르다`() {
        val referee = Referee(Opponent(FakeNumberGenerator()), DigitsRule(3))
        assertThrows<IllegalArgumentException> { referee.makeNumber() }
    }
}