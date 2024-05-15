package baseball.view

class OutputView {
    fun printGameStart(){
        println("숫자 야구 게임을 시작합니다.")
    }
    fun printResultOfInning(ball : Int, strike : Int){
        val result = when {
            ball == ZERO_POINT && strike == ZERO_POINT -> "낫싱"
            ball == ZERO_POINT -> "${strike}스트라이크"
            strike == ZERO_POINT -> "${ball}볼"
            else -> "${ball}볼 ${strike}스트라이크"
        }
        println(result)
    }
    fun printResultOfBaseBall(){
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
    companion object {
        private const val ZERO_POINT = 0
    }
}