package baseball

import baseball.domain.InputChecker
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class InputCheckerTest {
    @Test
    fun `입력이 4가지의 숫자이라면 true 반환`() {
        // given
        val input = 1234

        // when
        val result = InputChecker().isWrongNumberInput(input)

        // then
        assertTrue(result)
    }

    @Test
    fun `입력이 2가지의 숫자라면 true 반환`() {
        // given
        val input = 12

        // when
        val result = InputChecker().isWrongNumberInput(input)

        // then
        assertTrue(result)
    }

    @Test
    fun `중복된 숫자가 입력 될 때 true 반환`() {
        // given
        val input = 122

        // when
        val result = InputChecker().isWrongNumberInput(input)

        // then
        assertTrue(result)
    }

    @Test
    fun `계속 할건지 물어볼 때 올바른 숫자가 아닐 경우 true 반환`() {
        // given
        val input = 3

        // when
        val result = InputChecker().isWrongNumberInput(input)

        // then
        assertTrue(result)
    }
}