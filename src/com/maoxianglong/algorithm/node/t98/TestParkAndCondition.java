/**
 * @Author: xianglong
 * @Date: 2020/3/16 3:59 下午
 */
package com.maoxianglong.algorithm.node.t98;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: mxl
 * @Date: 2020/3/16 3:59 下午
 */
public class TestParkAndCondition {

    private final ReentrantLock reentrantLock = new ReentrantLock();
    private final Condition condition = reentrantLock.newCondition();

    public static void main(String[] args) throws InterruptedException {

        TestParkAndCondition testParkAndCondition = new TestParkAndCondition();

        Thread t1 = new Thread(() ->{
            testParkAndCondition.test();
        });
        t1.setName("t1");

        Thread t2 = new Thread(() ->{
            testParkAndCondition.test();
        });
        t1.setName("t2");

        t1.start();
        Thread.sleep(3000);
        t2.start();


    }

    public void test(){
        reentrantLock.lock();

        try {
            Thread.sleep(3000);
            condition.await();
            Thread.sleep(3000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        reentrantLock.unlock();
    }

}
