package io.husseinhj.androidpatterns

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val simpleCommaPattern = "##,#,#"
    private val simpleDashPattern = "##-#-#"
    private val mobilePattern = "98###(###)## ##"
    private val postalCodePattern = "#####-#####"
    private val simpleDashPatternWithEndedZero = "##-#-#0.00"

    // String
    @Test
    fun applyPatternForStringTypeWithComma() {
        assertEquals("12345".applyPattern(simpleCommaPattern), "12,3,45")
    }
    @Test
    fun applyExactPatternForStringTypeWithComma() {
        assertEquals("12345".applyPattern(simpleCommaPattern, true), "12,3,4")
    }
    @Test
    fun applyPatternForSimpleString() {
        assertEquals("12345".applyPattern(simpleDashPattern), "12-3-45")
    }
    @Test
    fun applyExactPatternForStringHasHardCodedZero() {
        assertEquals("12345".applyPattern(simpleDashPatternWithEndedZero, exactPattern = true), "12-3-40.00")
    }
    @Test
    fun applyMobilePattern() {
        assertEquals("9121234567".applyPattern(mobilePattern, exactPattern = true), "98912(123)45 67")
    }
    @Test
    fun applyPostalCodePattern() {
        assertEquals("4771865131".applyPattern(postalCodePattern, exactPattern = true), "47718-65131")
    }

    // Int
    @Test
    fun applyPatternForIntTypeWithComma() {
        assertEquals(12345.applyPattern(simpleCommaPattern), "12,3,45")
    }
    @Test
    fun applyExactPatternForIntTypeWithComma() {
        assertEquals(12345.applyPattern(simpleCommaPattern, true), "12,3,4")
    }
    @Test
    fun applyPatternForIntSimplePattern() {
        assertEquals(12345.applyPattern(simpleDashPattern), "12-3-45")
    }
    @Test
    fun applyExactPatternForIntHasHardCodedZero() {
        assertEquals(12345.applyPattern(simpleDashPatternWithEndedZero, exactPattern = true), "12-3-40.00")
    }
    @Test
    fun applyIntMobilePattern() {
        assertEquals(9121234567.applyPattern(mobilePattern, exactPattern = true), "98912(123)45 67")
    }

}