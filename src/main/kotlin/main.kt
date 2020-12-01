fun main(args: Array<String>) {
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