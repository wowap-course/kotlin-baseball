package baseball.domain

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ValidationTest {
    @Test
    fun `값은 숫자이다`() {
        val input = "abc"
        assertThrows<IllegalArgumentException> { Validation().isNumber(input) }
    }

    @Test
    fun `값은 세자리 숫자이다`() {
        val input = "46"
        assertThrows<IllegalArgumentException> { Validation().isThreeDigits(input) }
    }

    @Test
    fun `값은 중복되지 않는 세자리 숫자이다`() {
        val input = "889"
        assertThrows<IllegalArgumentException> { Validation().isNoDuplicate(input) }
    }
}