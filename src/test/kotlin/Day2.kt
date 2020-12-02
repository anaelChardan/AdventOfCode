import arrow.core.Tuple4
import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Day2 : FunSpec({
    test("it extracts the password rule") {
        "1-2 a: abababababa".toPasswordRule() shouldBe PasswordRule(
            1,
            2,
            'a',
            "abababababa"
        )
    }

    test("it count all the letters in the password") {
        "ababababa".groupByLetter() shouldBe mapOf('a' to 5, 'b' to 4)
    }

    test("it is able to say if a password match a first policy rule") {
        "1-2 a: ababababa".toPasswordRule().doesMatchFirstPolicy() shouldBe false
        "1-5 a: ababababa".toPasswordRule().doesMatchFirstPolicy() shouldBe true
    }

    test("it counts how many passwords are valid regarding first policy") {
        listOf("1-3 a: abcde",
                "1-3 b: cdefg",
                "2-9 c: ccccccccc").countValidPasswordFirstPolicy() shouldBe 2
    }

    test("it counts how many passwords are valid regarding second policy") {
        listOf("1-3 a: abcde",
            "1-3 b: cdefg",
            "2-9 c: ccccccccc").countValidPasswordSecondPolicy() shouldBe 1
    }
})