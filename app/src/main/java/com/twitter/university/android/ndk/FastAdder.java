/*
 * Copyright (c) 2015 Twitter Inc.
 */
package com.twitter.university.android.ndk;

final class FastAdder {

    private static native int addNative(int a1, int a2);
    static { System.loadLibrary("addLib"); }

    public int add(int a1, int a2) { return addNative(a1, a2); }
}
