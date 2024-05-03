package baseball.view

class InputView {
    fun readAnswer() : List<Int> {
        print("숫자를 입력해주세요 : ")
        return runCatching {
            val answer = readln()
            return validateInput(answer)
        }.onFailure { e ->
            println(e.message)
        }.getOrElse { readAnswer() }
    }
    fun readStartOrQuit() : Int {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return readln().toInt()
    }
    private fun validateInput(answer : String) : List<Int> {
        requireNumber(answer)
        requireThreeDigits(answer)
        requireNoDuplicate(answer)
        return validate(answer)
    }
    private fun requireNumber(inputNumber : String) {
        require(inputNumber.toIntOrNull() != null) {"[ERROR]: 입력된 값은 숫자가 아닙니다."}
    }
    private fun requireThreeDigits(inputNumber: String) {
        require(inputNumber.length == 3) {"[ERROR]: 입력된 값은 세자리가 아닙니다."}
    }
    private fun requireNoDuplicate(inputNumber: String) {
        require(inputNumber.toSet().size == inputNumber.length) {"[ERROR]: 중복된 숫자가 있습니다."}
    }
    private fun validate(answer : String) : List<Int> = answer.toList().map { it.toString().toInt() }
}