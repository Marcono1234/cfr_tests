package org.benf.cfr.tests;

/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 05/05/2011
 * Time: 18:48
 * To change this template use File | Settings | File Templates.
 */
public class SyncTest1a {

    private int x;

    public int test1() {
        synchronized (this) {
            try {
                return x;
            } catch (Throwable t) {
                throw t;
            }
        }
    }
}
