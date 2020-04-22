/**
 * @Author: xianglong
 * @Date: 2020/3/14 4:28 下午
 */
package com.maoxianglong.algorithm.node.t98;

import java.util.concurrent.CountDownLatch;

/**
 * @Author: mxl
 * @Date: 2020/3/14 4:28 下午
 */
public class CountDownLunchTest {

    public static void main(String[] args) throws InterruptedException {
        final CountDownLatch cdOrder = new CountDownLatch(4);
        for (int i = 0; i < 4; i++){
            Thread t1 = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + " countDown before...");
                cdOrder.countDown();
                System.out.println(Thread.currentThread().getName() + " countDown after...");

            });
            t1.setName("t" + i);
            t1.start();
        }
        cdOrder.await();
        System.out.println("main starting...");
    }

}
