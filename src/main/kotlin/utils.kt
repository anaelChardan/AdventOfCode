import arrow.core.Tuple3
import arrow.core.extensions.sequence.semigroupK.combineK

fun <T> cartesianProduct(first: Sequence<T>, second: Sequence<T>): Sequence<Pair<T, T>> =
    sequence {
        first.forEach { a ->
            second
                .filter { b -> b != a }
                .forEach {
                    yield(a to it)
                }
        }
    }

fun <T> cartesianProduct(first: Sequence<T>, second: Sequence<T>, third: Sequence<T>): Sequence<Tuple3<T, T, T>> =
    sequence {
        first.forEach { a ->
            second.forEach { b ->
                third.filter { it != a && it != b && a != b }
                    .forEach { c ->
                        yield(Tuple3(a, b, c))
                    }
            }
        }
    }