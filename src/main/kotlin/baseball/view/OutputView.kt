package baseball.view

import baseball.GameController
import baseball.domain.Referee

class OutputView {
    fun gameStart() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun countOutput(resultCount: Referee) {
        val strikeCount = resultCount.strikeCount
        val ballCount = resultCount.ballCount
        println("S : ${strikeCount}, B : ${ballCount}")
    }

    fun winOutput(){
        println("3개의 숫자를 모두 맞히셨습니다!")
    }

    fun gameStop():Int {
        println("게임 종료")
        return 0
    }
}