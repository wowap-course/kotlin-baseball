package baseball.domain

class Game{
    fun start(randomBaseballNumber:List<Int>, inputBaseballNumber: Int?):Referee {
        val inputBaseballNumber = inputBaseballNumber.toString().map { it.toInt() - '0'.toInt() }
        val count = Judgement().correctCount(randomBaseballNumber,inputBaseballNumber)
        return count
    }
}