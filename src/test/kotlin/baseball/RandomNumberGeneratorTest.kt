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

    @Test
    fun `randomNumGenerate 랜덤 수 3개를 반환한다`() {
        val numbers = RandomNumberGenerator().randomNumberGenerate()
        assertThat(numbers.size).isEqualTo(3)
    }

    @Test
    fun `randomNumberGenerate 랜덤 수는 겹치지 않는 3개의 수이다`() {
        val numbers = RandomNumberGenerator().randomNumberGenerate().toSet()
        assertThat(numbers.size).isEqualTo(3)
    }
}