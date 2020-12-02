fun main(args: Array<String>) {
    day2Problem()
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