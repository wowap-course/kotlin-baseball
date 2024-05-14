package baseball

import baseball.view.InputView
import baseball.view.OutputView

fun main() {
    BaseballController(InputView(), OutputView()).run()
}
