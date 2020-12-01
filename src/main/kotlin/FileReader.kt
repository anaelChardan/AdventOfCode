import java.io.File

fun <T> readFileAsSequence(path: String, block: (Sequence<String>) -> T): T {
    return File(path).useLines { block(it) }
}

fun readFileAsLines(path: String): List<String> = File(path).readLines();
