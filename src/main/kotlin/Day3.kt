
data class Slope(val right: Int, val down: Int)

fun Char.isTree() = this == '#'

fun List<String>.numberOfTreesBySlope(slope: Slope): Int {
    val reachableLines = this.filterIndexed { index, _ -> index % slope.down == 0 }

    return reachableLines
        .filterIndexed { step, line -> line[(step * slope.right) % line.length].isTree() }
        .count()
}