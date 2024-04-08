package baseball.domain.computer

import baseball.view.OutputView

class Referee {
    var strike = Computer.RESET_NUMBER
    var ball = Computer.RESET_NUMBER

    private val outputview = OutputView()

    fun call(computer: MutableList<Int>, player: List<Int>) {
        for (i in computer.indices) {
            if (computer[i] == player[i]) {
                strike++
            } else if (player.contains(computer[i])) {
                ball++
            }
        }

        outputview.printGameResult(strike, ball)
    }

    fun reset() {
        if (strike != Computer.THREE_STRIKE) {
            strike = Computer.RESET_NUMBER
            ball = Computer.RESET_NUMBER
        }
    }

    fun isThreeStrike(): Boolean {
        return strike == Computer.THREE_STRIKE
    }
}