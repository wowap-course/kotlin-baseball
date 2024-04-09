package study

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import baseball.domain.computer.Referee

class BaseballTest {

    @Test
    fun `심판은 스트라이크와 볼을 판단한다`() {
        // given
        val referee = Referee()
        val computerNumbers = mutableListOf(1,2,3)
        val yourNumber = listOf(2,3,4)

        // when
        val (strike, ball) = referee.call(computerNumbers, yourNumber)

        // then
        assertThat(0).isEqualTo(strike)
        assertThat(2).isEqualTo(ball)

    }
}