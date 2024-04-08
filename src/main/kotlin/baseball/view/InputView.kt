package baseball.view

class InputView {
    fun readAnswer() : String {
        println("숫자를 입력해주세요 : ")
        return readln()
    }
    fun readStartOrNot() : Int {
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.\n")
        return readln().toInt()
    }
}