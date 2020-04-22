/**
 * @Author: xianglong
 * @Date: 2020/3/20 9:06 下午
 */
package com.maoxianglong.algorithm.node.t98;

/**
 * @Author: mxl
 * @Date: 2020/3/20 9:06 下午
 */
public class TestSynchroized {

    private static TestSynchroized testSynchroized = new TestSynchroized();

    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            testSynchroized.test();
            System.out.println("a");
        });

        Thread t2 = new Thread(() ->{
            testSynchroized.test();
            System.out.println("c");
        });

        t1.start();
        t2.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("d");
    }

    public synchronized void test(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("b");
    }

}
