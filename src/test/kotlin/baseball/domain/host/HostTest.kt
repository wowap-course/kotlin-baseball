package baseball.domain.host

import baseball.domain.digitsrule.DigitsRule
import baseball.domain.numbergenerator.NumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class HostTest {
    inner class FakeNumberGenerator : NumberGenerator {
        override fun get(): String {
            return "123"
        }
    }
    @Test
    fun `상대방의 숫자를 알고 있다`() {
        val host = Host(FakeNumberGenerator(), DigitsRule(3))
        assertThat(host.makeNumber()).isEqualTo("123")
    }
}