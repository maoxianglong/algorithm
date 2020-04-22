/**
 * @Author: xianglong
 * @Date: 2020/3/26 10:21 上午
 */
package com.maoxianglong.algorithm.node.t98;

/**
 * @Author: mxl
 * @Date: 2020/3/26 10:21 上午
 */
public class TestFinally {

    public static void main(String[] args) {
        TestFinally testFinally = new TestFinally();
        try {
            testFinally.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test() throws Exception{

        try {
            throw new Exception("exception");
        }finally {
            System.out.println("finally");
        }

    }

}
