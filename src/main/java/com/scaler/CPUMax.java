//Taken from the lesson in Backend : Java for Projects - 2
package com.scaler;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class CPUMax {
    public static void main(String[] args) {
        Thread t1 = new Thread(CPUMax::overloadThread);
        Thread t2 = new Thread(CPUMax::overloadThread);

        t1.start();
        t2.start();
    }

    static void overloadThread () {
        var start = System.currentTimeMillis();
        System.out.println("Started at: " + start + "on Thread " + Thread.currentThread().getName());
        while (System.currentTimeMillis() - start < 50000) {}
        System.out.println("Ended the tread " + Thread.currentThread().getName());
    }
}
