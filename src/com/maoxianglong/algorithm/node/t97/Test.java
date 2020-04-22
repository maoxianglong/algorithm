/**
 * @Author: xianglong
 * @Date: 2020/3/14 11:36 上午
 */
package com.maoxianglong.algorithm.node.t97;

/**
 * @Author: mxl
 * @Date: 2020/3/14 11:36 上午
 */
public class Test {

    public static void main(String[] args) {

        Test t = new Test();
        Thread t1 = new Thread(() -> {
            try {
                t.test1();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                t.test1();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
        Thread t3 = new Thread(() -> {
            try {
                t.test1();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t2.start();
        t3.start();

    }

    public synchronized void test1() throws InterruptedException {
        System.out.println("waiting start...");
//        wait();
        Thread.sleep(1000);
        System.out.println("waiting end...");
    }

    public synchronized void test2() {
        System.out.println("notify start...");
        notify();
        System.out.println("notify end...");
    }

}
