package baseball.domain.computer

import baseball.domain.Score
import baseball.domain.computer.Computer.Companion.RESET_NUMBER
import baseball.view.OutputView

class Referee {
    var score = Score(RESET_NUMBER, RESET_NUMBER)

    private val outputview = OutputView()

    fun call(computerNumbers: MutableList<Int>, playerNumbers: List<Int>) {
        for (i in computerNumbers.indices) {
            if (computerNumbers[i] == playerNumbers[i]) {
                score.strike++
            } else if (playerNumbers.contains(computerNumbers[i])) {
                score.ball++
            }
        }

        outputview.printGameResult(score.strike, score.ball)
    }

    fun reset() {
        if (score.strike != Computer.THREE_STRIKE) {
            score.strike = Computer.RESET_NUMBER
            score.ball = Computer.RESET_NUMBER
        }
    }

    fun isThreeStrike(): Boolean {
        return score.strike == Computer.THREE_STRIKE
    }
}