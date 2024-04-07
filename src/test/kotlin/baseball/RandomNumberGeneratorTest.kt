package baseball

import baseball.domain.RandomNumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomNumberGeneratorTest {
    @Test
    fun `checkRandomNumberLength 랜덤 수의 길이가 3이면 true 를 반환한다`() {
        val number = listOf(1, 2, 3)
        val result = RandomNumberGenerator().checkRandomNumberSize(number)

        assertThat(result).isTrue()
    }

    @Test
    fun `checkRandomNumberLength 랜덤 수의 길이가 3이 아니면 false 를 반환한다`() {
        val number = listOf(1, 2)
        val result = RandomNumberGenerator().checkRandomNumberSize(number)

        assertThat(result).isFalse()
    }

}