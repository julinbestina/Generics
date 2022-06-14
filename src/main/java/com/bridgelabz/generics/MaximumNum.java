package com.bridgelabz.generics;

public class MaximumNum {
    Integer num1, num2, num3;
    Double num4, num5, num6;

    public MaximumNum() {

    }

    public int findMaximumNum(Integer num1, Integer num2, Integer num3){
        if((num1.compareTo(num2)) >0 && (num1.compareTo(num3)) > 0) {
            return num1;
        }
        else if(num2.compareTo(num3) > 0) {
            return num2;
        }
        return num3;
    }

    public double findMaximumNum(Double num1, Double num2, Double num3){
        if((num1.compareTo(num2)) >0 && (num1.compareTo(num3)) > 0) {
            return num1;
        }
        else if(num2.compareTo(num3) > 0) {
            return num2;
        }
        return num3;
    }


}
