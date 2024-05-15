package racingcar

import baseball.GameController
import baseball.view.InputView
import baseball.view.OutputView

fun main() {
    GameController(InputView(), OutputView()).run()
}
