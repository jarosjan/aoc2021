package day03

import readInput

fun main() {
    val input = readInput("Day03")

    val gamma = getMostCommonNumber(input).toInt(2) // most common bit
    val epsilon = findLeastCommonNumber(input).toInt(2) // least common bit

    println("$gamma $epsilon")

    println(gamma * epsilon)
}

private fun getMostCommonNumber(input: List<String>): String {
    var number = ""
    var nulls = 0
    var ones = 0
    input[0].forEachIndexed { index, _ ->
        for (line in input) {
            if (line[index] == '0') nulls++ else ones++
        }
        if (nulls > ones) number += 0 else number += 1
        nulls = 0
        ones = 0
    }
    println(number)
    return number
}

private fun findLeastCommonNumber(input: List<String>): String {
    var number = ""
    var nulls = 0
    var ones = 0
    input[0].forEachIndexed { index, _ ->
        for (line in input) {
            if (line[index] == '0') nulls++ else ones++
        }
        if (nulls < ones) number += 0 else number += 1
        nulls = 0
        ones = 0
    }
    println(number)
    return number
}
