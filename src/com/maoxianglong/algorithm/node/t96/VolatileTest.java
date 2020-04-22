/**
 * @Author: xianglong
 * @Date: 2020/3/20 8:19 下午
 */
package com.maoxianglong.algorithm.node.t96;

/**
 * @Author: mxl
 * @Date: 2020/3/20 8:19 下午
 */
public class VolatileTest {

    private static volatile boolean flag = false;

    public static void main(String[] args) throws InterruptedException {

        new Thread(() -> {
            while (!flag){

            }
            System.out.println("==============t1 run end");
        }).start();

        Thread.sleep(2000);

        new Thread(() -> {
            System.out.println("update before...");
            flag = true;
            System.out.println("update end...");
        }).start();

    }

}
