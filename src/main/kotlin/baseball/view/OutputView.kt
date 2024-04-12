package baseball.view

import baseball.domain.BaseballScore

class OutputView {
    fun printStrikeOnly(baseballScore: BaseballScore) {
        when {
            baseballScore.strike == 0 && baseballScore.ball == 0 -> println("낫싱")
            baseballScore.strike == 0 && baseballScore.ball > 0 -> println("${baseballScore.ball}볼")
            baseballScore.strike > 0 && baseballScore.ball == 0 -> println("${baseballScore.strike}스트라이크")
            else -> println("${baseballScore.strike}스트라이크 ${baseballScore.ball}볼")
        }
    }

    fun printEndBaseballPlay() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}
