/**
 * @Author: xianglong
 * @Date: 2020/3/14 5:46 下午
 */
package com.maoxianglong.algorithm.node.t98;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: mxl
 * @Date: 2020/3/14 5:46 下午
 */
public class ParkTest {

    public static void main(String[] args) {
        Thread t1 = new Thread(LockSupport::park);

        Thread t2 = new Thread(() -> {
            LockSupport.unpark(t1);
        });

        t1.start();
        System.out.println("123");
        t2.start();
    }

}
