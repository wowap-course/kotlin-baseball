package baseball.view

class InputView {
    fun readGuessedNumber(): Int {
        return runCatching {
            print("숫자를 입력해주세요 : ")
            requireNotNull(readln().toIntOrNull()) { "숫자를 입력해야합니다" }
        }.getOrElse { readGuessedNumber() }
    }

    fun readDecideMoreOrStop(): Int {
        return runCatching {
            print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
            val input = readln().toIntOrNull()
            requireNotNull(input) { "숫자를 입력해야합니다" }
            require(input in 1..2) { "1 또는 2를 입력해아합니다" }
            input
        }.getOrElse { readDecideMoreOrStop() }
    }
}
