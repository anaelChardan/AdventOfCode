import arrow.core.Some
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Day1 : FunSpec({
    test("compute the problem") {
        Day1Part1(
            listOf(
                1721,
                979,
                366,
                299,
                675,
                1456
            ).asSequence()
        ) shouldBe Some(514579)
    }

    test("compute the second problem") {
        Day1Part2(
            listOf(
                1721,
                979,
                366,
                299,
                675,
                1456
            ).asSequence()
        ) shouldBe Some(241861950)
    }
})