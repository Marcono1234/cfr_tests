package org.benf.cfr.tests;


/**
 * Created by IntelliJ IDEA.
 * User: lee
 * Date: 03/04/2012
 */
public class CastTest8 {

    public void t1() {
        int s = 2;
        call(s);
        call((long)s);
    }

    public void call(long l) {
    }

}
