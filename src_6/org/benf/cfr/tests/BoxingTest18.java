package org.benf.cfr.tests;

/**
 * Created with IntelliJ IDEA.
 * User: lee
 * Date: 23/05/2013
 * Time: 17:59
 */
public class BoxingTest18 {
    private void t(Integer[] x) {
        for (Integer i : x) {
            i = x[i];
        }
    }

}
