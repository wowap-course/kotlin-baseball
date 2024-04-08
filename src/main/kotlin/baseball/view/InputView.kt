package baseball.view

class InputView {
    fun inputBaseBallNumber(): Int? {
        print("숫자를 입력해주세요 : ")
        return readln().toIntOrNull()
    }

    fun inputGameRestart():Int{
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return readln().toInt()
    }
}