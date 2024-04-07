package baseball

import baseball.domain.Judge
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class JudgeTest {
    @Test
    fun `calculateStrike 스트라이크 개수를 세어준다`() {
        val inputNumber = listOf(4, 5, 1)
        val randomNumber = listOf(7, 5, 4)

        val result = Judge().calculateStrike(inputNumber, randomNumber)
        assertThat(result).isEqualTo(1)
    }

    @Test
    fun `calculateBall 볼 개수를 세어준다`() {
        val inputNumber = listOf(4, 5, 1)
        val randomNumber = listOf(7, 5, 4)

        val result = Judge().calculateBall(inputNumber, randomNumber)
        assertThat(result).isEqualTo(1)
    }
}