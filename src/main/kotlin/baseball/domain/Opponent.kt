package baseball.domain

import baseball.domain.numbergenerator.NumberGenerator

class Opponent(referee: Referee) {
    val number = referee.makeNumber()
}