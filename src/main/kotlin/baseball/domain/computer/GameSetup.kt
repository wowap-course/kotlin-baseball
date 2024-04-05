package baseball.domain.computer

class GameSetup {

    fun generateRandomNumber() {
        val computer = Computer()

        repeat(3) {
            val randomNumber = (1..9).random()
            if (!computer.number.contains(randomNumber)) {
                computer.number.add(randomNumber)
            }
        }
    }
}