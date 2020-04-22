/**
 * @Author: xianglong
 * @Date: 2020/3/13 11:41 下午
 */
package com.maoxianglong.algorithm.node.t98;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: mxl
 * @Date: 2020/3/13 11:41 下午
 */
public class Test {

    public static ReentrantLock reentrantLock = new ReentrantLock();

    /**
     * join方法会让当前线程阻塞，让出CPU时间片，直到调用join的线程执行完毕当前线程才能继续执行。
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        Thread t2 = new Thread(() -> {
//            System.out.println("t2 running1");
//            try {
//                Thread.sleep(3000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("t2 running2");
            run();
        });
        t2.setName("thread-002");

        Thread t1 = new Thread(() -> {
//            System.out.println("t1 running1");
//            try {
//                Thread.yield();
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("t1 running2");
            run();
        });
        t1.setName("thread-001");

        t1.start();
        t2.start();
    }

    public static void run()
    {
        for (int i = 1; i <= 100; i++)
        {
            if (i < 100 && Thread.currentThread().getName().equals("t1"))
                Thread.yield();
            System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }

}
