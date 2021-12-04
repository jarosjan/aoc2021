package day02

import readInput

fun main() {
    fun part1(input: List<String>): Int {
        return input.size
    }

    fun part2(input: List<String>): Int {
        return input.size
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02_test")
    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))

    countDirection(testInput)
    countDirection(input)
}

private fun countDirection(testInput: List<String>) {
    val pairs = createPairs(testInput)

    var horizontal = 0
    var depth = 0

    for (pair in pairs) {
        when (pair.first) {
            "forward" -> horizontal += pair.second
            "up" -> depth += pair.second
            "down" -> depth -= pair.second
        }
    }

    println(horizontal * Math.abs(depth))
}

private fun createPairs(testInput: List<String>): List<Pair<String, Int>> = testInput
    .map { Pair(it.split(" ").first(), it.split(" ").last().toInt()) }
    .toCollection(mutableListOf())

