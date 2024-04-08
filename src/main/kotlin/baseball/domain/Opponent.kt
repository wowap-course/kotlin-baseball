package baseball.domain

import baseball.domain.numbergenerator.NumberGenerator

class Opponent(numberGenerator: NumberGenerator) {
    val number = numberGenerator.get()
}