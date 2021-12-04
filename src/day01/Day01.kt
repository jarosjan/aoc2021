package day01

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01_test")
    check(part1(testInput) == 10)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))

    countIncrements(testInput)
    countIncrements(input)
}

private fun countIncrements(testInput: List<String>) {
    var counter = 0
    var previous = 0
    testInput.forEachIndexed { index, number ->
        if (index == 0) {
            previous = number.toInt()
        } else {
            if (previous < number.toInt()) {
                counter++
            }
        }
        previous = number.toInt()
    }
    println(counter)
}
