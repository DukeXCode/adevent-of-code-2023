package common

import java.io.File

class FileReader(val path: String) {
    fun getFileLines(): List<String> {
        return File(path).readLines()
    }
}