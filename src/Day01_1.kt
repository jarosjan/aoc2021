fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_1_test")
    val input = readInput("Day01_1")
    println(part1(input))
    println(part2(input))

    countIncrements(testInput)
    countIncrements(input)
}

private fun countIncrements(testInput: List<String>) {
    var counter = 0
    var tmpSum = 0
    var tmpSum2 = 0
    testInput.forEachIndexed { index, _ ->
        if (testInput.size <= index + 3) return@forEachIndexed
        for (i in index..index + 2) {
            tmpSum += testInput[i].toInt()
        }
        for (i in index + 1..index + 3) {
            tmpSum2 += testInput[i].toInt()
        }
        if (tmpSum < tmpSum2) counter++
        tmpSum = 0
        tmpSum2 = 0
    }
    println(counter)
}
