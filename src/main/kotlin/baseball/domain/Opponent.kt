package baseball.domain

class Opponent(val number : Int) {
    init {
        require(number.toString().toSet().size == number.toString().length)
    }
}