/**
 * @Author: xianglong
 * @Date: 2020/3/23 11:07 下午
 */
package com.maoxianglong.algorithm.node.t98;

import java.util.concurrent.CyclicBarrier;

/**
 * @Author: mxl
 * @Date: 2020/3/23 11:07 下午
 */
public class TestCyclicBarrier {

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(4, () -> {
            System.out.println("all tasks is done");
        });

        new Thread(() ->{
            try {
                System.out.println("t1 starting...");
                Thread.sleep(1000);
                cyclicBarrier.await();
                System.out.println("t1 done");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() ->{
            try {
                System.out.println("t2 starting...");
                Thread.sleep(1000);
                cyclicBarrier.await();
                System.out.println("t2 done");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

        new Thread(() ->{
            try {
                System.out.println("t3 starting...");
                Thread.sleep(1000);
                cyclicBarrier.await();
                System.out.println("t3 done");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();

    }

}
