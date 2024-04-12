package baseball

import baseball.domain.BaseballNumbers
import baseball.domain.BaseballScore
import baseball.domain.Judgment
import baseball.domain.numbergenerator.UniqueRandomNumbersGenerator
import baseball.view.InputView
import baseball.view.OutputView

class BaseballController(private val inputView: InputView, private val outputView: OutputView) {

    private val judgment = Judgment()
    fun run() {
        var isContinue = true
        while (isContinue) {
            isContinue = playOneRound()
        }
    }

    private fun playOneRound(): Boolean {
        outputView.printBaseballStart()
        val randomNumbers =
            UniqueRandomNumbersGenerator(numbers = NUMBERS_RANGE.toList(), length = NUMBERS_LENGTH).generate()
        var isCorrect = false
        while (!isCorrect) {
            isCorrect = guessComputerNumbers(BaseballNumbers.from(randomNumbers))
        }
        return inputView.isContinue()
    }

    private fun guessComputerNumbers(computerNumbers: BaseballNumbers): Boolean {
        val baseballScore = judgment.judgeScore(computerNumbers, getPlayerNumbers())
        outputView.printBaseballScore(baseballScore)
        if (baseballScore == BaseballScore(3, 0)) {
            outputView.printEndBaseballPlay()
            return true
        }
        return false
    }

    private fun getPlayerNumbers(): BaseballNumbers {
        return runCatching {
            BaseballNumbers.from(inputView.readGuessedNumber())
        }.getOrElse {
            outputView.printError(it.message.toString())
            getPlayerNumbers()
        }
    }

    companion object {
        private val NUMBERS_RANGE = (1..9)
        private const val NUMBERS_LENGTH = 3
    }
}
