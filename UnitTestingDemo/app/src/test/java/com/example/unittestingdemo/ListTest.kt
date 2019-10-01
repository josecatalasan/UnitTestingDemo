package com.example.unittestingdemo

import junit.framework.Assert.assertFalse
import junit.framework.Assert.assertTrue
import org.junit.Before
import org.junit.Test

class ListTest {
    lateinit var customList : CustomList

    @Before
    fun set(){
        customList = CustomList()
    }

    @Test
    fun testIsEmptyReturnTrue(){
        assertTrue(customList.isEmpty())
    }

    @Test
    fun testIsEmptyReturnFalse(){
        customList.insert("THING")
        assertFalse(customList.isEmpty())
    }
}