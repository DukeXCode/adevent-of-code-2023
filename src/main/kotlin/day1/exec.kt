package day1

import common.FileReader

fun main() {
    val lines = FileReader("src/main/resources/day1.txt").getFileLines()
    println(getCalibrationValueSum(lines))
}