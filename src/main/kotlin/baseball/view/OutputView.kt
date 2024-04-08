package baseball.view

class OutputView {
    fun printNothing() {
        println("낫싱")
    }

    fun printStrikeOnly(strike: Int) {
        println("${strike}스트라이크")
    }

    fun printBallOnly(ball: Int) {
        println("${ball}볼")
    }

    fun printBallAndStrike(strike: Int, ball: Int) {
        println("${ball}볼 ${strike}스트라이크")
    }

    fun endBaseballPlay() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}