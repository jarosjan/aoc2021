package day03

import readInput

fun main() {
    val input = readInput("Day03_1")

    val oxygen = findMostCommonNumber(input).toInt(2) // most common bit
    val co2 = findLeastCommonNumber(input).toInt(2) // least common bit

    println("$oxygen $co2")

    println(oxygen * co2)
}

private fun findMostCommonNumber(input: List<String>, depth: Int = 0): String {
    if (input.size == 1) return input[0]
    var nulls = 0
    var ones = 0
    val newInput = mutableListOf<String>()
    for (line in input) {
        if (line[depth] == '0') nulls++ else ones++
    }
    return if (ones >= nulls) {
        input.filter { it[depth] == '1' }.toCollection(newInput)
        findMostCommonNumber(newInput, depth + 1)
    } else {
        input.filter { it[depth] == '0' }.toCollection(newInput)
        findMostCommonNumber(newInput, depth + 1)
    }
}

private fun findLeastCommonNumber(input: List<String>, depth: Int = 0): String {
    if (input.size == 1) return input[0]
    var nulls = 0
    var ones = 0
    val newInput = mutableListOf<String>()
    for (line in input) {
        if (line[depth] == '0') nulls++ else ones++
    }
    return if (ones < nulls) {
        input.filter { it[depth] == '1' }.toCollection(newInput)
        findLeastCommonNumber(newInput, depth + 1)
    } else {
        input.filter { it[depth] == '0' }.toCollection(newInput)
        findLeastCommonNumber(newInput, depth + 1)
    }
}
