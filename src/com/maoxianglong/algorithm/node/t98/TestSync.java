/**
 * @Author: xianglong
 * @Date: 2020/3/18 9:46 上午
 */
package com.maoxianglong.algorithm.node.t98;

/**
 * @Author: mxl
 * @Date: 2020/3/18 9:46 上午
 */
public class TestSync {

    private Object object = new Object();

    public void test(){

        synchronized (object){
            System.out.println("adc");
        }

    }

}
