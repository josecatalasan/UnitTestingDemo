package com.example.unittestingdemo

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mockito.*

class StringsUtilsTest {
    lateinit var stringUtils: StringUtils

    @Before
    fun set(){
        stringUtils = StringUtils()
    }

    @Test
    fun testIfConcatTwoStringsReturnsCorrect(){
        val testS1 = "Hello"
        val testS2 = "World"
        val expectedResult = "Hello World"

        assertEquals(expectedResult, stringUtils.concatTwoStrings(testS1, testS2))
    }

    @Test
    fun testIsStringProperLengthReturnsTrue(){
        val testStringLongerThanFour = "abcde"
        assertTrue(stringUtils.isStringProperLength(testStringLongerThanFour))
    }

    @Test
    fun testIsStringProperLengthReturnsFalse(){
        val testStringLessThanFour = "abcd"
        assertFalse(stringUtils.isStringProperLength(testStringLessThanFour))
    }

    @Test
    fun testGetQueryUrlReturnsProperUrl(){
        val testSchema = "https"
        val testBaseUrl = "randomuser.me"
        val testPath = "api"
        val testQuery = "results"
        val expectedResult = "https://randomuser.me/api/?results"
        val mockUrlUtil : UrlUtils = mock(UrlUtils::class.java)
        `when`(mockUrlUtil.makeUrl(testSchema,testBaseUrl,testPath)).thenReturn("https://randomuser.me/api")
        stringUtils = StringUtils(mockUrlUtil)

        assertEquals(expectedResult, stringUtils.getQueryUrl(testQuery, testSchema, testBaseUrl, testPath ))
    }

    @Test
    fun testPrintUrlToConsoleIfUrlUtilsRunsThreeTimes(){
        val testTimeToRun = 3
        val testUrl = "test"

        val mockUrlUtil : UrlUtils = mock(UrlUtils::class.java)
        stringUtils = StringUtils(mockUrlUtil)

        stringUtils.printUrlToConsole(testUrl, testTimeToRun)
        verify(mockUrlUtil, times(3)).displayUrl(testUrl)
        //verify(mockUrlUtil, atLeast(3)).displayUrl(testUrl)
    }
}