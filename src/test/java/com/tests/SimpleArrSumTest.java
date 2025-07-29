package com.tests;

import com.ejercicios.SimpleArrSum;
import static org.junit.Assert.*;
import org.junit.Test;

public class SimpleArrSumTest {

    @Test public void test1() { assertEquals(15, SimpleArrSum.simpleArraySum(new int[]{1,2,3,4,5})); }
    @Test public void test2() { assertEquals(0, SimpleArrSum.simpleArraySum(new int[]{})); }
    @Test public void test3() { assertEquals(5, SimpleArrSum.simpleArraySum(new int[]{5})); }
    @Test public void test4() { assertEquals(-6, SimpleArrSum.simpleArraySum(new int[]{-1, -2, -3})); }
    @Test public void test5() { assertEquals(100, SimpleArrSum.simpleArraySum(new int[]{10,20,30,40})); }
    @Test public void test6() { assertEquals(1, SimpleArrSum.simpleArraySum(new int[]{1,0,0,0})); }
    @Test public void test7() { assertEquals(9999, SimpleArrSum.simpleArraySum(new int[]{9999})); }
    @Test public void test8() { assertEquals(0, SimpleArrSum.simpleArraySum(new int[]{0,0,0,0})); }
    @Test public void test9() { assertEquals(100000, SimpleArrSum.simpleArraySum(new int[]{50000, 50000})); }
    @Test public void test10() { assertEquals(-5, SimpleArrSum.simpleArraySum(new int[]{-10, 5})); }
}

