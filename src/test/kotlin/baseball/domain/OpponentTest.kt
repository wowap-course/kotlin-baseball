package baseball

import baseball.domain.DigitsRule
import baseball.domain.Opponent
import baseball.domain.Referee
import baseball.domain.numbergenerator.NumberGenerator
import baseball.domain.numbergenerator.RandomNumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class OpponentTest {
    inner class FakeNumberGenerator : NumberGenerator {
        override fun get(): String = "123"
    }
    @Test
    fun `게임에서 사용할 숫자를 가진다`() {
        val opponent = Opponent(Referee(FakeNumberGenerator(), DigitsRule(3)));
        assertThat(opponent.number).isEqualTo("123")
    }
}