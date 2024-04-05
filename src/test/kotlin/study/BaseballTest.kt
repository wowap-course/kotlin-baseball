package study

import baseball.domain.computer.Computer
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.random.Random

class BaseballTest {

    @Test
    fun `컴퓨터는 랜덤한 숫자 3개를 생성하여 가진다`() {
        val computer = Computer()

        repeat(3) {
            val randomNumber = (1..9).random()
            if (!computer.number.contains(randomNumber)) {
                computer.number.add(randomNumber)
            }
        }
        println(computer.number)

    }
}