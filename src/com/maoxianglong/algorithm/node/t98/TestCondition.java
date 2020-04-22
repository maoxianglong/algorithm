/**
 * @Author: xianglong
 * @Date: 2020/3/16 3:36 下午
 */
package com.maoxianglong.algorithm.node.t98;

import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: mxl
 * @Date: 2020/3/16 3:36 下午
 */
public class TestCondition {

    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final Condition not_full = reentrantLock.newCondition();

    public static void main(String[] args) throws InterruptedException {

        TestCondition testCondition = new TestCondition();

        Thread t1 = new Thread(() ->{
            testCondition.await();
        });
        t1.setName("t1");

        Thread t3 = new Thread(() ->{
            testCondition.await();
        });
        t3.setName("t3");

        Thread t2 = new Thread(() ->{
            testCondition.singal();
        });
        t2.setName("t2");

        t1.start();
        t3.start();
//        Thread.sleep(10000);
        t2.start();

    }

    public void await() {
        reentrantLock.lock();
        System.out.println(Thread.currentThread().getName() + " reentrantLock await start...");
        try {
            Thread.sleep(5000);
            not_full.await();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " reentrantLock await end...");
        reentrantLock.unlock();
    }

    public void singal() {
        reentrantLock.lock();
        System.out.println(Thread.currentThread().getName() + " reentrantLock singal start...");
        try {
            Thread.sleep(5000);
            not_full.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " reentrantLock singal end...");
        reentrantLock.unlock();
    }

}
