package baseball.domain.referee

import baseball.domain.Referee
import baseball.domain.DigitsRule
import baseball.domain.numbergenerator.NumberGenerator
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class RefereeTest () {
    inner class FakeNumberGenerator : NumberGenerator {
        override fun get(): String = "123"
    }
    private val referee = Referee(FakeNumberGenerator(), DigitsRule(3))
    @Test
    fun `상대방의 숫자를 알고 있다`() {
        assertThat(referee.makeNumber()).isEqualTo("123")
    }

    @Test
    fun `숫자에 대해 낫싱을 판단할 수 있다`() {
        val answer = "456"
        assertThat(referee.refereeNumber(answer)).isEqualTo("낫싱")
    }

    @ParameterizedTest
    @ValueSource(strings = ["391", "231"])
    fun `입력한 수에 대해 '볼'을 판단할 수 있다`(answer : String) {
        var ball = 0
        val number = referee.makeNumber()
        answer.forEachIndexed { index, c -> if(c != number[index] && c in number) ball++ }
        assertThat(referee.refereeNumber(answer)).isEqualTo("${ball}볼")
    }

    @ParameterizedTest
    @ValueSource(strings = ["124", "183"])
    fun `입력한 수에 대해 '스트라이크'를 판단할 수 있다`(answer : String) {
        var strike = 0
        val number = referee.makeNumber()
        answer.forEachIndexed { index, c -> if(c == number[index]) strike++ }
        assertThat(referee.refereeNumber(answer)).isEqualTo("${strike}스트라이크")
    }
}
