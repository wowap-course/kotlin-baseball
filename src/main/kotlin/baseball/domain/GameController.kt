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
        val judgement = Judgement()
        val opponentNumber = RandomNumberGenerator().generateNumber()
        var startOrQuit = 1

        while(startOrQuit == 1) {
            val answer = inputView.readAnswer()
            ValidInput() //으로 검사
            val validAnswer = answer.toList().map { it.toString().toInt() }
            //judgement로 검사
            val (ball, strike) = Judgement().judgeNumber(opponentNumber, validAnswer)
            //judgement가 판단한 값을 output에 넘김
            outputView.printResultOfInning(ball, strike)
            //한 라운드 종료
        }

        outputView.printResultOfBaseBall()
        restartOrQuit()
    }
    fun restartOrQuit(){
        val startOrQuit = inputView.readStartOrQuit()
        if(startOrQuit == 1) run()
        else if(startOrQuit == 2) return
    }
}