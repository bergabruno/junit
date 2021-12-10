package com.in28minutes.junit.helper;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringHelperTest {

        StringHelper stringHelper;

        @Before
        public void before(){
            stringHelper = new StringHelper();
        }

        @Test
        public void testTruncateAInFirst2Positions_Ainfirst2Positions(){
            assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"));
        }

        @Test
        public void testTruncateAInFirst2Positions_AinfirstPosition(){
            assertEquals("CDA", stringHelper.truncateAInFirst2Positions("ACDA"));
        }

        @Test
        public void testAreFirstAndLastTwoCharactersTheSame_False(){
            assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("ABCD"));
        }

        @Test
        public void testAreFirstAndLastTwoCharactersTheSame_True(){
            assertTrue("A condicao falhou",stringHelper.areFirstAndLastTwoCharactersTheSame("ABAB"));
        }

}