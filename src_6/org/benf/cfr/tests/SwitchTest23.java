package org.benf.cfr.tests;

// Courtesy AbeC
public class SwitchTest23 {
    static enum Something {
        ONE;
    }

    public static void main(String[] args) {
        // CFR doesn't resugar
        switch(Something.ONE) {
        }
    }
}
