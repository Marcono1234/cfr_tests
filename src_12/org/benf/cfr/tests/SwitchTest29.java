/*
 * Decompiled with CFR.
 */
package org.benf.cfr.tests;

public class SwitchTest29 {

    public static void foo(int x) {
        System.out.println(switch (x) {
            case 1 -> throw new IllegalStateException();
            case 2,3 -> {
                System.out.println("JIM");
                break "JIM";
            }
            case 4,5,54 -> "FRED";
            default -> {
                if (x < 100) break "ALICE";
                System.out.println("BOB!");
                break "BOB";
            }
        });
    }

    public static void main(String ... args) {
        foo(1);
        foo(3);
        foo(50);
        foo(300);
        foo(4);
    }
}
