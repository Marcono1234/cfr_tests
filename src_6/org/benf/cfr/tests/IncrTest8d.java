package org.benf.cfr.tests;

import java.util.Arrays;

public abstract class IncrTest8d {

    public static void main(String ... args) {
        int v[] = new int[]{1,2,3,4,5};
        int i = 2;
        v[++i] = v[++i];
        System.out.println(Arrays.toString(v));
    }
}
