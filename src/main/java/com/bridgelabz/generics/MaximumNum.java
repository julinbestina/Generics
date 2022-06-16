package com.bridgelabz.generics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaximumNum<T extends Comparable> {
    T num1, num2, num3;

    public MaximumNum(T num1, T num2, T num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public MaximumNum() {

    }

    public <T extends Comparable> T findMaximum(T... num) {
        Arrays.sort(num);
        int max = num.length - 1;
        return num[max];
    }


}
