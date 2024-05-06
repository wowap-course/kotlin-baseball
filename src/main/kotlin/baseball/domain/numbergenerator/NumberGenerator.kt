package baseball.domain.numbergenerator

import baseball.domain.BaseballNumber

interface NumberGenerator {
    fun generateNumber() : List<BaseballNumber>
}