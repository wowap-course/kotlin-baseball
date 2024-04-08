package baseball.domain


import baseball.view.InputView
import baseball.view.OutputView

class BaseballController {
    private val inputView = InputView()
    private val outputView = OutputView()
    private val judge = Judge()

    fun run() {
        println("숫자 야구 게임을 시작합니다.")
        baseballStart()
    }

    private fun baseballStart() {
        baseballPlay(RandomNumberGenerator().randomNumberGenerate())
        decideMoreOrStop()
    }


    private fun baseballPlay(answer: List<Int>) {
        var strike = INIT_NUMBER
        var ball = INIT_NUMBER
        while (strike != END_GAME_CONDITION) {
            val input = inputUserNumber(answer)
            strike = judge.calculateStrike(input, answer)
            ball = judge.calculateBall(input, answer)
            printResult(strike, ball)
        }
        outputView.endBaseballPlay()
    }
}