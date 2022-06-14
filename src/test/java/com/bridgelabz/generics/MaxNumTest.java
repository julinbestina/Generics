package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumTest {
    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        int result = maximumNum.findMaximumNum(23, 2, 1);
        Assert.assertEquals(23, result);
    }

    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        int result = maximumNum.findMaximumNum(56, 70, 65);
        Assert.assertEquals(70,result);
    }

    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        int result = maximumNum.findMaximumNum(15,46,83);
        Assert.assertEquals(83,result);
    }

    @Test
    public void givenMaxFloatNumInPos1_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        double result = maximumNum.findMaximumNum(9.84, 7.56, 2.58);
        Assert.assertEquals(9, result,84);
    }

    @Test
    public void givenMaxFloatNumInPos2_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        double result = maximumNum.findMaximumNum(8.956, 11.869, 5.26);
        Assert.assertEquals(11,result, 869);
    }

    @Test
    public void givenMaxFloatNumInPos3_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        double result = maximumNum.findMaximumNum(13.6985, 78.659, 98.65);
        Assert.assertEquals(98,result,65);
    }

}
