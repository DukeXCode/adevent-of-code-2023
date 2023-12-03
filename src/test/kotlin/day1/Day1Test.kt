package day1

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class Day1Test {
    @Test
    fun string_extractDigits_digits() {
        val input = "3jnvafbn3jijnb4n1"

        val result = extractDigits(input)

        val expected = listOf(3, 3, 4, 1)
        assertEquals(expected, result)
    }

    @Test
    fun stringWithMultipleTextDigit_extractDigits_digits() {
        val input = "xtwone3four"

        val result = extractDigits(input)

        val expected = listOf(2, 1, 3, 4)
        assertEquals(expected, result)
    }

    @Test
    fun stringWithOneTextDigit_extractDigits_digits() {
        val input = "abctwoxyz"

        val result = extractDigits(input)

        val expected = listOf(2)
        assertEquals(expected, result)
    }

    @Test
    fun string_getCalibrationValue_correctValue() {
        val input = "a1b2c3d4e5f"

        val result = getCalibrationValue(input)

        val expected = 15
        assertEquals(expected, result)
    }

    @Test
    fun stringWithTextDigit1_getCalibrationValue_correctValue() {
        val input = "two1nine"

        val result = getCalibrationValue(input)

        val expected = 29
        assertEquals(expected, result)
    }

    @Test
    fun stringWithTextDigit2_getCalibrationValue_correctValue() {
        val input = "eightwothree"

        val result = getCalibrationValue(input)

        val expected = 83
        assertEquals(expected, result)
    }

    @Test
    fun lines_getCalibrationValueSum_correctSum() {
        val lines = listOf(
            "1abc2",
            "pqr3stu8vwx",
            "a1b2c3d4e5f",
            "treb7uchet"
        )

        val result = getCalibrationValueSum(lines)

        val expected = 142
        assertEquals(expected, result)
    }

    @Test
    fun linesWithTextDigits_getCalibrationValueSum_correctSum() {
        val lines = listOf(
            "two1nine",
            "eightwothree",
            "abcone2threexyz",
            "xtwone3four",
            "4nineeightseven2",
            "zoneight234",
            "7pqrstsixteen"
        )

        val result = getCalibrationValueSum(lines)

        val expected = 281
        assertEquals(expected, result)
    }
}