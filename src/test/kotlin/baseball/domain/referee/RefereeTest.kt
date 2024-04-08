package baseball.domain.referee

import baseball.domain.digitsrule.DigitsRule
import baseball.domain.numbergenerator.NumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.sql.Ref

class RefereeTest () {
    inner class FakeNumberGenerator : NumberGenerator {
        override fun get(): String {
            return "123"
        }
    }
    private val referee = Referee(FakeNumberGenerator(), DigitsRule(3))
    @Test
    fun `상대방의 숫자를 알고 있다`() {
        assertThat(referee.makeNumber()).isEqualTo("123")
    }

    @Test
    fun `숫자에 대해 낫싱을 판단할 수 있다`() {
        val answer = "456"
        assertThat(referee.refereeNumber(answer)).isEqualTo("낫싱")
    }
}
