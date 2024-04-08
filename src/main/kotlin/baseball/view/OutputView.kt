package baseball.view

class OutputView {
    fun printGameStart(){
        println("숫자 야구 게임을 시작합니다.")
    }
    fun printResultOfInning(result : String){
        println(result)
    }
    fun printResultOfBaseBall(){
        println("3개의 숫자를 모두 맞히셨습니다! 게임 종료")
    }
}