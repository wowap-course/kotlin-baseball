package baseball

import baseball.domain.computer.Referee
import baseball.domain.numberRules.SelectNumber
import baseball.domain.numberRules.ThreeRandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class GameController {
    private val gameSetup = ThreeRandomNumberGenerator()
    private val seletNumber = SelectNumber()
    private val outputview = OutputView()
    private val inputview = InputView()
    private val referee = Referee()

    fun playGame() {
        val computer = gameSetup.generateRandomNumber()

        while (!referee.isThreeStrike()) {
            val input = inputview.printInputNumber()
            val player =  seletNumber.selectNumber(input)

            val (strike, ball) = referee.call(computer, player)
            referee.reset()
            outputview.printGameResult(strike, ball)
        }

        outputview.printWin()
    }
}