/**
 * @Author: xianglong
 * @Date: 2020/3/14 12:06 下午
 */
package com.maoxianglong.algorithm.node.t98;

/**
 * @Author: mxl
 * @Date: 2020/3/14 12:06 下午
 */
public class Test2 {

    static Test2 test2 = new Test2();

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            test2.test();
        });
        t1.setName("haha");
        Thread t2 = new Thread(() -> {
            test2.test();
        });
        Thread t3 = new Thread(() -> {
            test2.test();
        });
        Thread t4 = new Thread(() -> {
            test2.test();
        });

        Thread t5 = new Thread(() -> {
            test2.get();
        });

        t1.start();
        Thread.sleep(1000);
        t2.start();
        t3.start();
        t4.start();
//        t5.start();
    }

    public synchronized void test() {
        try {
            System.out.println(Thread.currentThread().getName() + "starting...");
            if (Thread.currentThread().getName().equals("haha")){
                wait();
            }
            System.out.println(Thread.currentThread().getName() + "end...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void get() {
        try {
//            notify();
//            Thread.sleep(2000);
            System.out.println("start notify...");
            notifyAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
