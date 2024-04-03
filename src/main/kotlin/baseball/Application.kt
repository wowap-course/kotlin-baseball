package racingcar

import baseball.domain.GameController
import baseball.view.InputView
import baseball.view.OutputView

fun main() {
    GameController(InputView(), OutputView()).run()
}
