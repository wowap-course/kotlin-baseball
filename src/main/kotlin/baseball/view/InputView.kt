package baseball.view

class InputView {
    fun readAnswer() : List<Int> {
        print("숫자를 입력해주세요 : ")
        return runCatching {
            val answer = readln()
            return numbersRead(answer)
        }.onFailure { e ->
            println(e.message)
        }.getOrElse { readAnswer() }
    }
    fun readStartOrQuit() : Int {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return readln().toInt()
    }
    private fun numbersRead(answer : String) : List<Int> {
        require(answer.toIntOrNull() != null) {"[ERROR]: 입력된 값은 숫자가 아닙니다."}
        return answer.toList().map { it.toString().toInt() }
    }
}