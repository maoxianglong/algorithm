/**
 * @Author: xianglong
 * @Date: 2020/3/14 12:19 下午
 */
package com.maoxianglong.algorithm.node.t98;

/**
 * @Author: mxl
 * @Date: 2020/3/14 12:19 下午
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("t1 starting...");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread t2 = new Thread(() -> {
            System.out.println("t2 starting...");
            try {
//                t1.join();
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        t1.start();
        t1.join();
//        t2.start();
        System.out.println(123);
    }


}
