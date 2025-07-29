package com.tests;

import com.ejercicios.TwoSum;
import static org.junit.Assert.*;
import org.junit.Test;
import java.util.Arrays;

public class TwoSumTest {

    private void assertArrayEqualsAnyOrder(int[] expected, int[] actual) {
        assertEquals(expected.length, actual.length);
        Arrays.sort(expected);
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }

    @Test public void test1() { assertArrayEqualsAnyOrder(new int[]{0,1}, TwoSum.twoSum(new int[]{2,7,11,15}, 9)); }
    @Test public void test2() { assertArrayEqualsAnyOrder(new int[]{1,2}, TwoSum.twoSum(new int[]{3,2,4}, 6)); }
    @Test public void test3() { assertArrayEqualsAnyOrder(new int[]{0,2}, TwoSum.twoSum(new int[]{1,5,4}, 5)); }
    @Test public void test4() { assertArrayEqualsAnyOrder(new int[]{0,3}, TwoSum.twoSum(new int[]{5,1,3,5}, 10)); }
    @Test public void test5() { assertArrayEqualsAnyOrder(new int[]{2,3}, TwoSum.twoSum(new int[]{0,0,1,2}, 3)); }
    @Test public void test6() { assertArrayEqualsAnyOrder(new int[]{1,3}, TwoSum.twoSum(new int[]{8,3,2,5}, 8)); }
    @Test public void test7() { assertArrayEqualsAnyOrder(new int[]{0,2}, TwoSum.twoSum(new int[]{10,20,-5,3}, 5)); }
    @Test public void test8() { assertArrayEqualsAnyOrder(new int[]{1,2}, TwoSum.twoSum(new int[]{100,150,50}, 200)); }
    @Test public void test9() { assertArrayEqualsAnyOrder(new int[]{0,1}, TwoSum.twoSum(new int[]{-1,1}, 0)); }
    @Test public void test10() { assertArrayEqualsAnyOrder(new int[]{1,3}, TwoSum.twoSum(new int[]{4,2,7,8}, 10)); }
}

