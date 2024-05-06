package baseball.domain

data class BaseballNumbers(private val _baseballNumbers : List<Int>) {
    init {
        require(_baseballNumbers.toSet().size == _baseballNumbers.size) {"[ERROR]: 중복된 숫자가 있습니다."}
        require(_baseballNumbers.size == 3) {"[ERROR]: 입력된 값은 세자리가 아닙니다."}
    }
    val baseballNumbers : List<BaseballNumber>
        get() = _baseballNumbers.map { BaseballNumber(it) }
}