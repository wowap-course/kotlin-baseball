package baseball.domain.numbergenerator

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomNumberGeneratorTest {
    @Test
    fun `세 자리 숫자를 생성한다`() {
        val numbers = RandomNumberGenerator().generateNumber()
        assertThat(numbers.size == 3)
    }

    @Test
    fun `생성된 숫자엔 중복된 수가 없다`() {
        val numbers = RandomNumberGenerator().generateNumber()
        assertThat(numbers.toSet().size == numbers.size)
    }
}