package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 06:28
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionTestFinally10g {

    void callWhichMightThrow() {
    }

    int test1(int x) {
        bob : {
            if (x % 3 == 0) {
                System.out.println("Foo");
                break bob;
            }
            System.out.println("ooooh");
        }
        System.out.println("TEST!");
        return 1;
    }


}