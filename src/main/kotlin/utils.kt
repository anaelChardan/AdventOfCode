fun List<Int>.cartesianProduct(other: List<Int>): Sequence<Pair<Int, Int>> =
    sequence {
        forEach { a ->
            other
                .filter { b -> b != a }
                .forEach { yield(a to it) }
        }
    }
