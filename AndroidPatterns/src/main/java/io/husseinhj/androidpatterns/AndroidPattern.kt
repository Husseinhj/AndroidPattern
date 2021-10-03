package io.husseinhj.androidpatterns

class AndroidPattern {

    companion object {
        var digitPatterns = charArrayOf('#')

        fun applyPattern(value: String, pattern: String): String {
            return applyPattern(value, pattern, false)
        }

        fun applyPattern(value: String, pattern: String, exactPattern: Boolean = true): String {
            var digitCounter = 0
            var patternCounter = 0
            val appliedFormat = ArrayList<Char>()
            val stringDigitArray = value.toCharArray()
            val patternStringArray = pattern.toCharArray()

            while (patternCounter < patternStringArray.size) {

                if (digitCounter >= stringDigitArray.size && exactPattern) {
                    return appliedFormat.joinToString("")
                }

                if (digitPatterns.contains(patternStringArray[patternCounter])) {
                    appliedFormat.add(stringDigitArray[digitCounter])
                    digitCounter++
                } else {
                    appliedFormat.add(patternStringArray[patternCounter])
                }

                patternCounter++
            }

            if (digitCounter < patternCounter && !exactPattern) {
                val sliced = stringDigitArray.slice(IntRange(digitCounter, stringDigitArray.size - 1))
                appliedFormat.addAll(sliced)
            }

            return appliedFormat.joinToString("")
        }
    }

}