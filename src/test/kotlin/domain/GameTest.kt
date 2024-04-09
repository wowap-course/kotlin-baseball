package domain

import baseball.domain.numbergenerator.RandomNumberGenerator
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class GameTest {
    @Test
    fun `컴퓨터는 서로 다른 3개의 수를 선택한다`(){
        for(i in 1..100){
            println(getNumber())
        }
    }
    @Test
    fun `사용자가 입력하는 수는 3자리수여야 한다`(){
        val input1 = 12
        val input2 = 1234
        assertThrows<IllegalArgumentException> {
            validateInput(input1)
        }
        assertThrows<IllegalArgumentException> {
            validateInput(input2)
        }
    }

    private fun getNumber():MutableList<Int>{
        var randomNumber = listOf<Int>()
        randomNumber = (MIN_RANDOM_NUMBER..MAX_RANDOM_NUMBER).shuffled().take(MAX_GAME_SIZE).distinct().toMutableList()

        if (randomNumber[FIRST_DIGIT_NUMBER] == 0) return getNumber()
        return randomNumber
    }
    private fun validateInput(input: Int): String{
        if (input.toString().length != 3) {
            throw IllegalArgumentException("입력값은 3자리여야 합니다.")
        }
        return input.toString()
    }
    companion object {
        private const val MAX_RANDOM_NUMBER = 9
        private const val MIN_RANDOM_NUMBER = 0
        private const val MAX_GAME_SIZE = 3
        private const val FIRST_DIGIT_NUMBER = 0
    }
}