package baseball.domain.numberRules


class UserInputNumbers : PlayerSelectNumberRule {
    override fun selectNumber(input: String): List<Int> {
        val inputNumber = mutableListOf<Int>()

        val numbers = input.map { it.toString().toIntOrNull() }

        for (num in numbers) {
            if (num != null) {
                inputNumber.add(num)
            }
        }

        return inputNumber
    }
}