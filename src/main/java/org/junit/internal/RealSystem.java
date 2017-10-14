package org.junit.internal;

import java.io.PrintStream;

public class RealSystem implements JUnitSystem {

    @Override
    public String toString() {
        return "RealSystem [out()=" + out() + ", getClass()=" + getClass()
                + ", hashCode()=" + hashCode() +  "]";
    }

    /**
     * Will be removed in the next major release
     */
    @Deprecated
    public void exit(int code) {
        System.exit(code);
    }

    public PrintStream out() {
        return System.out;
    }

}
