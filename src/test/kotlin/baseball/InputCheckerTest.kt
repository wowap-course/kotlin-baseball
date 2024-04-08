package baseball

import baseball.domain.InputChecker
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InputCheckerTest {
    @Test
    fun `isWrongNumberInput 입력이 4가지의 숫자일 때 true 반환`() {
        val input = 1234
        assertThat(InputChecker().isWrongNumberInput(input)).isTrue()
    }

    @Test
    fun `isWrongNumberInput 입력이 2가지의 숫자일 때 true 반환`() {
        val input = 12
        assertThat(InputChecker().isWrongNumberInput(input)).isTrue()
    }

    @Test
    fun `isWrongNumberInput 입력에 겹치는 수가 있을 시 true 반환`() {
        val input = 122
        assertThat(InputChecker().isWrongNumberInput(input)).isTrue()
    }

    @Test
    fun `isWrongMoreOrStopCommand 1이나 2 아닐 경우 true 반환`() {
        val input = 3
        assertThat(InputChecker().isWrongNumberInput(input)).isTrue()
    }
}