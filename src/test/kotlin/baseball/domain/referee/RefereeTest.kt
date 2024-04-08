package baseball.domain.referee

import baseball.domain.digitsrule.DigitsRule
import baseball.domain.numbergenerator.NumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RefereeTest {
    inner class FakeNumberGenerator : NumberGenerator {
        override fun get(): String {
            return "123"
        }
    }
    @Test
    fun `상대방의 숫자를 알고 있다`() {
        val referee = Referee(FakeNumberGenerator(), DigitsRule(3))
        assertThat(referee.makeNumber()).isEqualTo("123")
    }
}