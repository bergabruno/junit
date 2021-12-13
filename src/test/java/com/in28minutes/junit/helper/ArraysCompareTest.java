package com.in28minutes.junit.helper;

import org.junit.*;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArraysCompareTest {

    //Arrays.sort
    @Test
    public void testArraySort_RandomArray() {
        int[] numbers = {12, 3, 4, 1};
        int[] expected = {1, 3, 4, 12};
        Arrays.sort(numbers);
        assertArrayEquals(expected, numbers);
    }


    //expected a nullPointer, quando vai fazer o sort, ele retorna o nullpointer
    @Test(expected = NullPointerException.class)
    public void testArraySort_NullArray() {
        int[] numbers = null; //int [] numbers = {} - red line
        Arrays.sort(numbers);
    }

    @Test(timeout = 100)
    public void testSort_Performance(){
        int array[] = { 12,23,4};
        for(int i = 0; i <= 10000; i++){
        array[0] = i;
        Arrays.sort(array);
        }
    }

}
