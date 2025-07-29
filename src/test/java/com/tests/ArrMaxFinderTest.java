package com.tests;

import com.ejercicios.ArrMaxFinder;
import static org.junit.Assert.*;
import org.junit.Test;

public class ArrMaxFinderTest {

    @Test public void test1() { assertEquals(5, ArrMaxFinder.findMax(new int[]{1, 2, 3, 4, 5})); }
    @Test public void test2() { assertEquals(100, ArrMaxFinder.findMax(new int[]{100})); }
    @Test public void test3() { assertEquals(-1, ArrMaxFinder.findMax(new int[]{-10, -5, -1})); }
    @Test public void test4() { assertEquals(0, ArrMaxFinder.findMax(new int[]{-10, 0, -20})); }
    @Test public void test5() { assertEquals(999, ArrMaxFinder.findMax(new int[]{0, 1, 999, 500})); }
}
