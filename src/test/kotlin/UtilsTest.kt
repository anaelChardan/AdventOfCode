import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class UtilsTest : FunSpec({
    test("it computes the cartesian product with pair of the same") {
        listOf(1, 2, 3, 4).cartesianProduct(listOf(1, 2, 3, 4)).toList() shouldBe listOf(
            1 to 2,
            1 to 3,
            1 to 4,
            2 to 1,
            2 to 3,
            2 to 4,
            3 to 1,
            3 to 2,
            3 to 4,
            4 to 1,
            4 to 2,
            4 to 3
        )
    }
})