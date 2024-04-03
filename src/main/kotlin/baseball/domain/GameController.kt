package baseball.domain

import baseball.domain.numbergenerator.NumberGenerator
import baseball.domain.numbergenerator.RandomNumberGenerator
import baseball.view.InputView
import baseball.view.OutputView

class GameController(
    private val inputView: InputView,
    private val outputView: OutputView
){
    fun run(){
        val baseballNumber = inputView.inputBaseBallNumber()
    }





}