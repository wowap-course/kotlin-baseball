package baseball.view

class InputView {
    fun inputNumber() : Int? {
        print("숫자를 입력해주세요 : ")
        return readln().toIntOrNull()
    }

    fun printDecideMoreOrStop(): Int? {
        print("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return readln().toIntOrNull()
    }
}