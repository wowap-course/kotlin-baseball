package baseball.domain.computer

import baseball.domain.Score
import baseball.domain.computer.Computer.Companion.RESET_NUMBER
import baseball.domain.computer.Computer.Companion.THREE_STRIKE

class Referee {
    private var score = Score(RESET_NUMBER, RESET_NUMBER)


    fun call(computerNumbers: MutableList<Int>, playerNumbers: List<Int>): Pair<Int, Int> {
        for (i in computerNumbers.indices) {
            if (computerNumbers[i] == playerNumbers[i]) {
                score.strike++
            } else if (playerNumbers.contains(computerNumbers[i])) {
                score.ball++
            }
        }

        return score.strike to score.ball
    }

    fun reset() {
        if (score.strike != THREE_STRIKE) {
            score.strike = RESET_NUMBER
            score.ball = RESET_NUMBER
        }
    }

    fun isThreeStrike(): Boolean {
        return score.strike == THREE_STRIKE
    }
}