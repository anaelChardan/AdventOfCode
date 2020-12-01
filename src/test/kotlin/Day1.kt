import io.kotest.core.spec.style.FunSpec
import io.kotest.fp.Option
import io.kotest.matchers.shouldBe

class Day1 : FunSpec({
    test("compute the problem") {
        compute(
            listOf(
                1721,
                979,
                366,
                299,
                675,
                1456
            )
        ) shouldBe Option.Some(514579)
    }
})