package baseball.domain

class Opponent(val number : String) {
    init {
        require(number.toSet().size == number.length)
    }
}