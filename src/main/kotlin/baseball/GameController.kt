package baseball

import baseball.domain.Game
import baseball.domain.Referee
import baseball.domain.numbergenerator.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView
import java.sql.Ref

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView
) {
    fun run() {
        outputView.gameStart()
        val randomNumberGenerator = RandomNumberGenerator()
        val randomBaseballNumber: List<Int> = randomNumberGenerator.getNumber()
        while(true) {
            val inputBaseballNumber = inputView.inputBaseBallNumber()
            val resultCount= Game().start(randomBaseballNumber,inputBaseballNumber)
            outputView.countOutput(resultCount)
            gameEnd(resultCount)
        }

    }
    fun gameEnd(resultCount:Referee){
        val strikeCount = resultCount.strikeCount
        if(strikeCount == 3) {
            outputView.winOutput()
            gameRestart()
        }
    }
    fun gameRestart(){
        val restartChoice = inputView.inputGameRestart()
        when(restartChoice){
            1 -> return run()
            2 -> outputView.gameStop()
        }
    }

}
