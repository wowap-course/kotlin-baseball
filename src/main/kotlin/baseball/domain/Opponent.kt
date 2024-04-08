package baseball.domain

class Opponent(referee: Referee) {
    val number = referee.makeNumber()
}