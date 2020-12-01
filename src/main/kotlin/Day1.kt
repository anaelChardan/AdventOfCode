import arrow.core.Option
import arrow.core.Tuple3
import arrow.core.toOption

fun compute(input: List<Int>): Option<Int> {
    return input
        .cartesianProduct(input)
        .map { Tuple3(it.first, it.second, it.first + it.second) }
        .find { it.c == 2020 }
        .toOption()
        .map { it.a * it.b }
}