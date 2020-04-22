/**
 * @Author: xianglong
 * @Date: 2020/4/8 1:52 下午
 */
package com.maoxianglong.algorithm.node.t98;

import java.util.concurrent.Semaphore;

/**
 * @Author: mxl
 * @Date: 2020/4/8 1:52 下午
 */
public class SemaphoreTest {

    public static void main(String[] args) throws InterruptedException {

        Semaphore semaphore = new Semaphore(5);

        semaphore.acquire();

        semaphore.release();

    }

}
