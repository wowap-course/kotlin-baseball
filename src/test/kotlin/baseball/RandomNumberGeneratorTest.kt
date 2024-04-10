package baseball

import baseball.domain.numbergenerator.RandomNumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomNumberGeneratorTest {
    @Test
    fun `랜덤 수 3개를 반환한다`() {
        // given

        // when
        val numbers = RandomNumberGenerator().generateNumber()

        // then
        assertThat(numbers.size).isEqualTo(3)
    }

    @Test
    fun `생성된 랜덤 수는 겹치지 않는 3개의 수이다`() {
        // given

        // when
        val numbers = RandomNumberGenerator().generateNumber().toSet()

        // then
        assertThat(numbers.size).isEqualTo(3)
    }
}