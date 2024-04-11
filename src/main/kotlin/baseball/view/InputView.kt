package baseball.view

import baseball.GameController

class InputView {
    fun inputBaseBallNumber(): Int {
        print("숫자를 입력해주세요 : ")
        var inputBaseBallNumber = checkInt()
        return inputBaseBallNumber
    }
    fun checkInt():Int{
        try {
            val baseballNumber = readln().toIntOrNull()
            require(baseballNumber is Int)
            require(baseballNumber in MIN_BASEBALL_NUMBER..MAX_BASEBALL_NUMBER)
            return baseballNumber
        } catch (e: IllegalArgumentException) {
            return checkInt()
        }

    }


    fun inputGameRestart():Int{
        println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.")
        return readln().toInt()
    }
    companion object{
        private const val MIN_BASEBALL_NUMBER = 100
        private const val MAX_BASEBALL_NUMBER = 999
    }
}