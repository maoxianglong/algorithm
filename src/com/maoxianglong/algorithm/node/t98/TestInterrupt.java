/**
 * @Author: xianglong
 * @Date: 2020/3/24 1:09 下午
 */
package com.maoxianglong.algorithm.node.t98;

/**
 * @Author: mxl
 * @Date: 2020/3/24 1:09 下午
 */
public class TestInterrupt {

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(() -> {
            try {
                System.out.println("aaa");
                System.out.println(Thread.currentThread().getName());
                System.out.println("bbb");
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        t1.setName("t1");
        t1.start();
        t1.interrupt();

        System.out.println(t1.isInterrupted());
        System.out.println(Thread.interrupted());

    }

}
