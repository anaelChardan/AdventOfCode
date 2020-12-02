fun Boolean.toInt() = if (this) 1 else 0

data class PasswordRule(val min: Int, val max: Int, val char: Char, val password: String)

fun String.groupByLetter(): Map<Char, Int> =
    this
        .toList()
        .groupBy { it }
        .map { (char, letters) -> char to letters.size }
        .toMap()

fun String.toPasswordRule(): PasswordRule {
    val match = Regex("(\\d+)-(\\d+) (\\w): (\\w+)").find(this)
    val (min, max, letter, password) = match!!.destructured

    return PasswordRule(min.toInt(), max.toInt(), letter.toCharArray()[0], password)
}

fun PasswordRule.doesMatchFirstPolicy(): Boolean {
    val importantLetter = this.password.groupByLetter()[this.char] ?: return false

    return importantLetter >= this.min && importantLetter <= this.max
}

fun List<String>.countRule(predicate: (PasswordRule) -> Boolean): Int =
    this.map { predicate(it.toPasswordRule()) }.count { it }

fun List<String>.countValidPasswordFirstPolicy(): Int = this.countRule(PasswordRule::doesMatchFirstPolicy)

fun PasswordRule.doesMatchSecondPolicy(): Boolean =
    ((this.password[this.min - 1] == this.char).toInt() + (this.password[this.max - 1] == this.char).toInt()) == 1

fun List<String>.countValidPasswordSecondPolicy(): Int = this.countRule(PasswordRule::doesMatchSecondPolicy)
