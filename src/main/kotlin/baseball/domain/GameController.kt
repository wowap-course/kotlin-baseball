package baseball.domain

import baseball.domain.numbergenerator.NumberGenerator
import baseball.domain.numbergenerator.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    fun run() {
        outputView.gameStart()
        start()
    }

    private fun start(){
        val randomNumberGenerator = RandomNumberGenerator()
        val randomBaseballNumber: List<Int> = randomNumberGenerator.getNumber()
        val baseballNumber = inputView.inputBaseBallNumber()
        try {
            require(baseballNumber is Int)
            require(baseballNumber in 100..999)
        } catch (e: IllegalArgumentException) {
            return start()
        }
    }

}