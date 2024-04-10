package baseball.domain

class Judge {
    fun calculateStrike(numbers1: List<Int>, numbers2: List<Int>): Int {
        return numbers1.indices.count { numbers1[it] == numbers2[it] }
    }

    fun calculateBall(numbers1: List<Int>, numbers2: List<Int>): Int {
        return numbers1.count { it in numbers2 && it != numbers2[numbers1.indexOf(it)] }
    }
}