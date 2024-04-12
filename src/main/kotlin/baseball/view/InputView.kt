package baseball.view

class InputView {

    fun getInputNumbers(): String {
        print("숫자를 입력하세요: ")
        val input = readlnOrNull() ?: ""

        return input
    }
}