package baseball.domain

class Validation {
    fun isNumber(inputNumber : String) {
        require(inputNumber.toIntOrNull() != null) {"[ERROR]: 입력된 값은 숫자가 아닙니다."}
    }
    fun isThreeDigits(inputNumber: String) {
        require(inputNumber.length == 3) {"[ERROR]: 입력된 값은 세자리가 아닙니다."}
    }
    fun isNoDuplicate(inputNumber: String) {
        require(inputNumber.toSet().size == inputNumber.length) {"[ERROR]: 중복된 숫자가 있습니다."}
    }
}