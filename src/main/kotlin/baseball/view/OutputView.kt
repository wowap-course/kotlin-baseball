package baseball.view

class OutputView {
    fun printNothing() {
        println("낫싱")
    }

    fun printStrikeOnly(strike: Int) {
        println("${strike}스트라이크")
    }

    fun printBallOnly(ball : Int) {
        println("${ball}볼")
    }

    fun printBallAndStrike(strike: Int, ball: Int) {
        println("${ball}볼 ${strike}스트라이크")
    }
}