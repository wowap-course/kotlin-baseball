package baseball.view

class InputView {

    fun inputBaseBallNumber(): Int {
        print("숫자를 입력해주세요 : ")
        return readln().toInt()
    }

}