package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 */
public class ExceptionTest6a {

    public int test (final Object a, final Object b, final Object c, final Object d) {
        try {
            try {
                return 1;
            } catch (ArithmeticException e) {
                throw e;
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
