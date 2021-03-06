package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 29/07/2013
 * Time: 16:23
 */
public class BoxingTest33 {

    public void test1(Horrid<Integer> h) {
        h.foo((Number)1);
        h.foo((Integer)1);
    }

    public void test(Horrid<String> h) {
        h.foo((Number)1);
        h.foo((Integer)1);
    }

    public static class Horrid<T> {

        boolean foo(int i) {
            return false;
        }

        boolean foo(T t) {
            return false;
        }

        boolean foo(Number i) {
            return true;
        }
    }
}
