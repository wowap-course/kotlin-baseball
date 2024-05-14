package baseball.view

class InputView {
    fun readGuessedNumber(): List<Int> {
        return runCatching {
            print("숫자를 입력해주세요 : ")
            return readln().chunked(1).map { it.toIntOrNull() ?: throw IllegalArgumentException("숫자만 입력해주세요") }
        }.getOrElse {
            println("[ERROR] ${it.message}")
            readGuessedNumber()
        }
    }

    fun isContinue(): Boolean {
        return runCatching {
            print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
            val input = readln().toIntOrNull()
            requireNotNull(input) { "숫자를 입력해야합니다" }
            require(input in 1..2) { "1 또는 2를 입력해아합니다" }
            input == 1
        }.getOrElse {
            println("[ERROR] ${it.message}")
            isContinue()
        }
    }
}
