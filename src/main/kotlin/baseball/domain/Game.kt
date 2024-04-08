package baseball.domain

import baseball.domain.numbergenerator.RandomNumberGenerator
import baseball.GameController
import baseball.domain.Judgement
import baseball.view.OutputView
import java.util.random.RandomGenerator.JumpableGenerator

class Game{
    fun start(randomBaseballNumber:List<Int>, baseballNumber: Int?):Count {
        val numList = baseballNumber.toString().map { it.toInt() - '0'.toInt() }
        val count = Judgement().correctCount(randomBaseballNumber,numList)
        return count
    }

}