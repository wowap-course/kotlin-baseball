package baseball.domain

class Game{
    fun start(randomBaseballNumber:List<Int>, baseballNumber: Int?):Referee {
        val baseballNumber = baseballNumber.toString().map { it.toInt() - '0'.toInt() }
        val count = Judgement().correctCount(randomBaseballNumber,baseballNumber)
        return count
    }
}