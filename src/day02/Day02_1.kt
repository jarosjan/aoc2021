package day02

import readInput

fun main() {
    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_1_test")
    val input = readInput("Day02_1")

    countDirection(testInput)
    countDirection(input)
}

private fun countDirection(testInput: List<String>) {
    val pairs = createPairs(testInput)

    var aim = 0
    var horizontal = 0
    var depth = 0

    for (pair in pairs) {
        when (pair.first) {
            "forward" -> {
                horizontal += pair.second
                depth += pair.second * aim
            }
            "up" -> aim -= pair.second
            "down" -> aim += pair.second
        }
//        println("$aim $horizontal $depth")
    }

    println(horizontal * Math.abs(depth))
}

private fun createPairs(testInput: List<String>): List<Pair<String, Int>> = testInput
    .map { Pair(it.split(" ").first(), it.split(" ").last().toInt()) }
    .toCollection(mutableListOf())

