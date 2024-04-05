package baseball.domain.player

class Game {

    fun selectNumber() {
        val inputNumber = mutableListOf<Int>()

        repeat(3) {
            val input = readln().toIntOrNull()
            if (input != null) {
                inputNumber.add(input)
            }
        }
    }
}