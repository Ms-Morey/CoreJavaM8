package org.java.multithreading;

public class Main extends Thread {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Main t1 = new Main();
        System.out.println(Thread.currentThread().getName());
        t1.start();
    }

    @Override
    public void run() {
        System.out.println("Hello world from thread 1");
        System.out.println(Thread.currentThread().getName());
    }
}
