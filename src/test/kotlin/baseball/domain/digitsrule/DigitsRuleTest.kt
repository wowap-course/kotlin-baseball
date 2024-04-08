package baseball.domain.digitsrule

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class DigitsRuleTest {
    @Test
    fun `주어진 값을 규칙에 맞게 판단할 수 있다`() {
        val digitsRule = DigitsRule(5)
        val number = "12345"
        assertTrue(digitsRule.setDigits(number))
    }
}