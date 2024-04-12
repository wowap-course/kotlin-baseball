package domain

import baseball.domain.Game
import baseball.domain.Referee
import baseball.domain.numbergenerator.RandomNumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class GameTest {
    @Test
    fun `start함수는 count를 리턴받는가?`(){
        val game = Game()
        val count = Game().start(listOf(1,2,3),123)
        assertThat(count).isEqualTo(Referee(3,0))
    }
}