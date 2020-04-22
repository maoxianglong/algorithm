/**
 * @Author: xianglong
 * @Date: 2020/3/26 2:40 下午
 */
package com.maoxianglong.algorithm.node.t98;

import java.util.concurrent.locks.LockSupport;

/**
 * @Author: mxl
 * @Date: 2020/3/26 2:40 下午
 */
public class TestPark {

    public static void main(String[] args) {


        Thread t1 = new Thread(() -> {

            while (true){
                LockSupport.park();
                System.out.println("1");
            }
        });

        t1.start();

        LockSupport.unpark(t1);

    }

}
