package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumTest {
    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnMaxNum() {
        MaximumNum maximumNum = new MaximumNum(23, 2, 1);
        int result = (int) maximumNum.findMaximum();
        Assert.assertEquals(23, result);
    }

    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnMaxNum() {
        MaximumNum maximumNum = new MaximumNum(56, 70, 65);
        int result = (int) maximumNum.findMaximum();
        Assert.assertEquals(70, result);
    }

    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnMaxNum() {
        MaximumNum maximumNum = new MaximumNum(15, 46, 83);
        int result = (int) maximumNum.findMaximum();
        Assert.assertEquals(83, result);
    }

    @Test
    public void givenMaxFloatNumInPos1_WhenMax_ShouldReturnMaxNum() {
        MaximumNum maximumNum = new MaximumNum(9.84, 7.56, 2.58);
        double result = (double) maximumNum.findMaximum();
        Assert.assertEquals(9, result, 84);
    }

    @Test
    public void givenMaxFloatNumInPos2_WhenMax_ShouldReturnMaxNum() {
        MaximumNum maximumNum = new MaximumNum(8.956, 11.869, 5.26);
        double result = (double) maximumNum.findMaximum();
        Assert.assertEquals(11, result, 869);
    }

    @Test
    public void givenMaxFloatNumInPos3_WhenMax_ShouldReturnMaxNum() {
        MaximumNum maximumNum = new MaximumNum(13.6985, 78.659, 98.65);
        double result = (double) maximumNum.findMaximum();
        Assert.assertEquals(98, result, 65);
    }

    @Test
    public void givenMaxStringInPos1_WhenMax_ShouldReturnMaxString() {
        MaximumNum maximumNum = new MaximumNum("Banana", "Peach", "Apple");
        String result = (String) maximumNum.findMaximum();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenMaxStringInPos2_WhenMax_ShouldReturnMaxString() {
        MaximumNum maximumNum = new MaximumNum("Apple", "Banana", "Peach");
        String result = (String) maximumNum.findMaximum();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenMaxStringInPos3_WhenMax_ShouldReturnMaxString() {
        MaximumNum maximumNum = new MaximumNum("Apple", "Peach", "Banana");
        String result = (String) maximumNum.findMaximum();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenMaxInPos3_WhenMax_ShouldReturnMaxString() {
        MaximumNum maximumNum = new MaximumNum("Apple", "Peach", "Banana");
        Comparable result = maximumNum.findMaximum();
        Assert.assertEquals("Peach", result);
    }

    @Test
    public void givenAnyNumberOfInput_WhenFindMax_ShouldReturnMax() {
        MaximumNum maximumNum = new MaximumNum();
        int result = (int) maximumNum.findMaximum(58, 63, 87, 105, 89, 36);
        Assert.assertEquals(105, result);
    }

}
