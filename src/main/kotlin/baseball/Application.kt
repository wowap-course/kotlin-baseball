package racingcar

import baseball.domain.GameController
import baseball.view.InputView
import baseball.view.OutputView

fun main() {
    val controller = GameController(InputView(), OutputView())
    controller.start()
    controller.run()
}
