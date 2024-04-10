package baseball

import baseball.domain.Judge
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JudgeTest {
    @Test
    fun `두 수를 비교했을 때 같은 자리에 같은 숫자인 수가 하나라면 strike는 1이다`() {
        // given
        val inputNumber = listOf(4, 5, 1)
        val randomNumber = listOf(7, 5, 4)

        // when
        val result = Judge().calculateStrike(inputNumber, randomNumber)

        // then
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `두 수를 비교했을 때 다른 자리에 같은 숫자가 하나있다면 ball은 1이다`() {
        // given
        val inputNumber = listOf(4, 5, 1)
        val randomNumber = listOf(7, 5, 4)

        // when
        val result = Judge().calculateBall(inputNumber, randomNumber)

        // then
        assertThat(result).isEqualTo(1)
    }
}