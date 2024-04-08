package baseball.domain

import baseball.domain.numbergenerator.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class GameController(
    private val inputView : InputView,
    private val outputView: OutputView,
) {
    fun start(){
        outputView.printGameStart()
    }
    fun run(){
        val referee = Referee(RandomNumberGenerator(), DigitsRule(3))
        val opponent = Opponent(referee)

        do {
            val answer = inputView.readAnswer()
            val result = referee.refereeNumber(opponent, answer)
            outputView.printResultOfInning(result)
        } while (result != "3스트라이크")

        outputView.printResultOfBaseBall()
        restartOrQuit()
    }
    fun restartOrQuit(){
        val startOrQuit = inputView.readStartOrQuit()
        if(startOrQuit == 1) run()
        else if(startOrQuit == 2) return
    }
}