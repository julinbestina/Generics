package com.bridgelabz.generics;

import org.junit.Assert;
import org.junit.Test;

public class MaxNumTest {
    @Test
    public void givenMaxNumInFirstPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        int result = maximumNum.findMaximum(23, 2, 1);
        Assert.assertEquals(23, result);
    }

    @Test
    public void givenMaxNumInSecondPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        int result = maximumNum.findMaximum(56, 70, 65);
        Assert.assertEquals(70,result);
    }

    @Test
    public void givenMaxNumInThirdPos_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        int result = maximumNum.findMaximum(15,46,83);
        Assert.assertEquals(83,result);
    }

    @Test
    public void givenMaxFloatNumInPos1_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        double result = maximumNum.findMaximum(9.84, 7.56, 2.58);
        Assert.assertEquals(9, result,84);
    }

    @Test
    public void givenMaxFloatNumInPos2_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        double result = maximumNum.findMaximum(8.956, 11.869, 5.26);
        Assert.assertEquals(11,result, 869);
    }

    @Test
    public void givenMaxFloatNumInPos3_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        double result = maximumNum.findMaximum(13.6985, 78.659, 98.65);
        Assert.assertEquals(98,result,65);
    }

    @Test
    public void givenMaxStringInPos1_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        String result = maximumNum.findMaximum("Banana","Peach","Apple");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenMaxStringInPos2_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        String result = maximumNum.findMaximum("Apple","Banana","Peach");
        Assert.assertEquals("Peach",result);
    }

    @Test
    public void givenMaxStringInPos3_WhenMax_ShouldReturnNum() {
        MaximumNum maximumNum = new MaximumNum();
        String result = maximumNum.findMaximum("Apple","Peach","Banana");
        Assert.assertEquals("Peach",result);
    }


}
