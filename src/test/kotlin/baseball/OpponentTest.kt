package baseball

import baseball.domain.Opponent
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class OpponentTest {
    @Test
    fun `게임에서 사용할 숫자를 가진다`() {
        val opponent = Opponent(123);
        assertThat(opponent.number).isEqualTo(123)
    }

    @Test
    fun `각각의 숫자는 서로 다르다`() {
        assertThrows<IllegalArgumentException> { Opponent(111) }
    }

    @Test
    fun `상대방(컴퓨터)의 숫자는 랜덤으로 생성된다`() {
        TODO("Not yet implemented")
    }
}