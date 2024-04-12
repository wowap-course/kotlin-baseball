package baseball.view

import baseball.GameController

class InputView {
    fun inputBaseBallNumber(): Int {
        print("숫자를 입력해주세요 : ")
        val baseballNumber = readln().toIntOrNull()
        return checkInt(baseballNumber)
    }
    fun checkInt(baseballNumber:Int?):Int{
        try {
            require(baseballNumber is Int)
            require(baseballNumber in MIN_BASEBALL_NUMBER..MAX_BASEBALL_NUMBER)
            val baseballNumber = baseballNumber.toInt()
            return baseballNumber
        } catch (e: IllegalArgumentException) {
            println("숫자 3글자를 입력해주세요")
            return inputBaseBallNumber()
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