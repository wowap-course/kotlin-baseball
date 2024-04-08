package baseball

import baseball.domain.Opponent
import baseball.domain.numbergenerator.NumberGenerator
import baseball.domain.numbergenerator.RandomNumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class OpponentTest {
    inner class FakeNumberGenerator : NumberGenerator {
        override fun get(): String = "135"
    }
    @Test
    fun `게임에서 사용할 숫자를 가진다`() {
        val opponent = Opponent("123");
        assertThat(opponent.number).isEqualTo("123")
    }

    @Test
    fun `각각의 숫자는 서로 다르다`() {
        assertThrows<IllegalArgumentException> { Opponent(111) }
    }

    @Test
    fun `상대방의 숫자는 3개의 숫자를 가진다`() {
        val randomNumberGenerator = RandomNumberGenerator()
        val opponent = Opponent(randomNumberGenerator.get())
        assertThat(opponent.number.toString().length).isEqualTo(3)
    }
}



