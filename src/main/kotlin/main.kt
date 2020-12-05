fun main(args: Array<String>) {
    day3Problem()
}

fun day1Problem() {
    val lines = readFileAsLines(
        "src/main/resources/DayOne.txt"
    ).map { it.toInt() }

    val result = Day1Part1(lines.asSequence())
    println(result)

    val linesTwo = readFileAsLines(
        "src/main/resources/DayOne.txt"
    ).map { it.toInt() }

    val result2 = Day1Part2(linesTwo.asSequence())
    println(result2)
}

fun day2Problem() {
    println(day2Input().countValidPasswordFirstPolicy())
    println(day2Input().countValidPasswordSecondPolicy())
}

fun day3Problem() {
    println(exampleDay3Input().numberOfTreesBySlope(Slope(3, 1)))
    val res = listOf<Slope>(
        Slope(1, 1),
        Slope(3,1),
        Slope(5, 1),
        Slope(7, 1),
        Slope(1, 2)
    ).map { day3Input().numberOfTreesBySlope(it) }.fold(1){ acc, e -> acc * e}
    println(res)
}