package baseball.domain

class InputChecker {
    fun isWrongNumberInput(input: Int?): Boolean {
        try {
            require(input != null) { "[ERROR] 입력이 잘못되었습니다." }
            val convertedInput = input.toString().map { it.toString().toInt() }
            require(convertedInput.size == MAX_INPUT_LENGTH) { "[ERROR] 3가지 숫자를 입력해야 합니다" }
            require(convertedInput.toSet().size == convertedInput.size) { "[ERROR] 중복된 숫자 입력" }
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return true
        }
        return false
    }

    fun isWrongMoreOrStopCommand(command: Int?): Boolean {
        try {
            require(command != null) { "[ERROR] 입력은 정수형이여야 합니다." }
            require(command == MORE_GAME_COMMAND || command == STOP_GAME_COMMAND) { "[ERROR] 입력은 1 또는 2여야 합니다." }
        } catch (e: IllegalArgumentException) {
            println(e.message)
            return true
        }
        return false
    }

    companion object {
        const val MAX_INPUT_LENGTH = 3
        const val STOP_GAME_COMMAND = 2
        const val MORE_GAME_COMMAND = 1
    }
}