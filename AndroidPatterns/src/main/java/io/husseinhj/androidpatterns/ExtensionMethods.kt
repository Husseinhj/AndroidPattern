package io.husseinhj.androidpatterns

import java.math.BigDecimal
import java.math.BigInteger


fun Long.applyPattern(pattern: String, exactPattern: Boolean = false): String {
    return AndroidPattern.applyPattern(this.toString(), pattern, exactPattern)
}

fun Int.applyPattern(pattern: String, exactPattern: Boolean = false): String {
    return AndroidPattern.applyPattern(this.toString(), pattern, exactPattern)
}

fun Float.applyPattern(pattern: String, exactPattern: Boolean = false): String {
    return AndroidPattern.applyPattern(this.toString(), pattern, exactPattern)
}

fun BigInteger.applyPattern(pattern: String, exactPattern: Boolean = false): String {
    return AndroidPattern.applyPattern(this.toString(), pattern, exactPattern)
}

fun BigDecimal.applyPattern(pattern: String, exactPattern: Boolean = false): String {
    return AndroidPattern.applyPattern(this.toString(), pattern, exactPattern)
}

fun Double.applyPattern(pattern: String, exactPattern: Boolean = false): String {
    return AndroidPattern.applyPattern(this.toString(), pattern, exactPattern)
}

fun String.applyPattern(pattern: String, exactPattern: Boolean = false): String {
    return AndroidPattern.applyPattern(this, pattern, exactPattern)
}