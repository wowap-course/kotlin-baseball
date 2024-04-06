package baseball.domain.computer

class Referee {
    var strike = Computer.RESET_NUMBER
    var ball = Computer.RESET_NUMBER

    fun call(computer: MutableList<Int>, player: List<Int>): Pair<Int, Int> {
        for (i in computer.indices) {
            if (computer[i] == player[i]) {
                strike++
            } else if (player.contains(computer[i])) {
                ball++
            }
        }

        return strike to ball
    }

    fun reset() {
        if (strike != Computer.THREE_STRIKE) {
            strike = Computer.RESET_NUMBER
            ball = Computer.RESET_NUMBER
        }
    }
}