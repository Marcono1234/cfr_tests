package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ArrayTest10c {

    private static class CA {
    }

    private static class CB extends CA {
    }

    private static class CC extends CA {
    }

    void test3(boolean x) {
        CA[] a;
        if (x) {
            a = new CB[4];
        } else {
            a = new CC[4];
        }
        System.out.println(a);
    }

}
