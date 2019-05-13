package org.benf.cfr.tests;


import org.benf.cfr.tests.support.UnaryFunction;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 11/04/2013
 * Time: 17:49
 */
// This breaks (initially) in J9 due to removal of static markers on anonymous inner classes
// see https://bugs.java.com/bugdatabase/view_bug.do?bug_id=8034044
public class AnonymousInnerClassTest11 {
    public static Object test(int x) {
        final int y = x+1;   // in later java, effectively final is sufficient.
        Object t = new UnaryFunction<Integer, Integer>() {

            @Override
            public Integer invoke(Integer arg) {
                return arg * y;
            }
        };
        return t;
    }
}
