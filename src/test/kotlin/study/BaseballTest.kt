package study

import baseball.domain.computer.Computer
import baseball.domain.computer.GameSetup
import baseball.domain.player.Game
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

    @Test
    fun `플레이어는 랜덤한 숫자 3개를 선택한다`() {
        val input = mutableListOf<Int>()

        input.add(7)
        input.add(8)
        input.add(9)

        println(input)
    }

    @Test
    fun `플레이어와 컴퓨터의 숫자를 비교한다`() {
        val computer = mutableListOf(4, 5, 6)
        val player = mutableListOf(4, 5, 6)

        var strike = 0
        var ball = 0

        for (i in computer.indices) {
            if (computer[i] == player[i]) {
                strike++
            } else if (player.contains(computer[i])) {
                ball++
            }
        }

        when {
            strike > 0 && ball > 0 -> println("$strike 스트라이크 $ball 볼")
            strike > 0 -> println("$strike 스트라이크")
            ball > 0 -> println("$ball 볼")
            else -> println("낫딩")
        }
    }
}