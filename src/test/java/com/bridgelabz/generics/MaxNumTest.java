package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumTest {

    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum(23, 2, 1);
        int result = maximumNum.findMaximumNum();
        Assert.assertEquals(23, result);
    }

    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum(56, 70, 65);
        int result = maximumNum.findMaximumNum();
        Assert.assertEquals(70,result);
    }

    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum(15,46,83);
        int result = maximumNum.findMaximumNum();
        Assert.assertEquals(83,result);
    }
}
