package baseball.domain

import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.api.Test

class ValidInputTest {
    @Test
    fun `값은 숫자이다`() {
        val input = "abc"
        assertThrows<IllegalArgumentException> { ValidInput().isNumber(input) }
    }

    @Test
    fun `값은 세자리 숫자이다`() {
        val input = "46"
        assertThrows<IllegalArgumentException> { ValidInput().isThreeDigits(input) }
    }

    @Test
    fun `값은 중복되지 않는 세자리 숫자이다`() {
        val input = "889"
        assertThrows<IllegalArgumentException> { ValidInput().isNoDuplicate(input) }
    }
}