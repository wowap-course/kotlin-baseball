package baseball.domain.numberRules

import baseball.view.InputView

class SelectNumber : PlayerSelectNumberRule {
    private val  inputview = InputView()
    override fun selectNumber(): List<Int> {
        val inputNumber = mutableListOf<Int>()

        val input = inputview.printInputNumber()
        val numbers = input.map { it.toString().toIntOrNull() }

        for (num in numbers) {
            if (num != null) {
                inputNumber.add(num)
            }
        }

        return inputNumber
    }
}