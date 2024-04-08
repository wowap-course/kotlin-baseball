package baseball.domain.player

import baseball.domain.computer.Referee
import baseball.domain.numberRules.SelectNumber
import baseball.domain.numberRules.ThreeRandomNumberGenerator
import baseball.view.OutputView

class Game {
    private val gameSetup = ThreeRandomNumberGenerator()
    private val seletNumber = SelectNumber()
    private val outputview = OutputView()
    private val referee = Referee()

    fun playGame() {
        val computer = gameSetup.generateRandomNumber()

        while (!referee.isThreeStrike()) {
            val player =  seletNumber.selectNumber()

            referee.call(computer, player)
            referee.reset()
        }

        outputview.printWin()
    }
}