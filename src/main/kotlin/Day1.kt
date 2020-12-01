import arrow.core.*

fun Day1Part1(input: Sequence<Int>): Option<Int> {
    return cartesianProduct(input, input)
        .map { (a, b) -> Tuple3(a, b, a + b) }
        .find { it.c == 2020 }
        .toOption()
        .map { (a, b) -> a * b }
}

fun Day1Part2(input: Sequence<Int>): Option<Int> {
    return cartesianProduct(input, input, input)
        .map { (a, b, c) -> Tuple4(a, b, c, a + b + c) }
        .find { it.d == 2020 }
        .toOption()
        .map { (a, b, c, _) -> a * b * c }
}