package baseball

import baseball.domain.Game
import baseball.domain.numbergenerator.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    fun run() {
        outputView.gameStart()
        val randomNumberGenerator = RandomNumberGenerator()
        val randomBaseballNumber: List<Int> = randomNumberGenerator.getNumber()
        while(true) {
            val resultCount= Game().start(randomBaseballNumber, checkInt())
            outputView.result(resultCount)
        }
    }

    fun checkInt():Int{
        try {
            val baseballNumber = inputView.inputBaseBallNumber()
            require(baseballNumber is Int)
            require(baseballNumber in GameController.MIN_BASEBALL_NUMBER..GameController.MAX_BASEBALL_NUMBER)
            return baseballNumber
        } catch (e: IllegalArgumentException) {
            return checkInt()
        }

    }


    companion object{
        private const val MIN_BASEBALL_NUMBER = 100
        private const val MAX_BASEBALL_NUMBER = 999
    }
}
