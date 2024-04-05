package baseball.view

class OutputView {

    fun printStartGame() {
        println("숫자 야구 게임을 시작합니다.")
    }

    fun printGameResult(strike: Int, ball: Int) {
        when {
            strike > 0 && ball > 0 -> println("$strike 스트라이크 $ball 볼")
            strike > 0 -> println("$strike 스트라이크")
            ball > 0 -> println("$ball 볼")
            else -> println("낫딩")
        }
    }

    fun printWin() {
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}