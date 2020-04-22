/**
 * @Author: xianglong
 * @Date: 2020/3/20 7:06 下午
 */
package com.maoxianglong.algorithm.node.t96;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: mxl
 * @Date: 2020/3/20 7:06 下午
 */
public class GCTest {

    private static List<GCTest> gcTests = new ArrayList<>(1024 * 1024);

    public static void main(String[] args) throws InterruptedException {
        while (true){
            gcTests.add(new GCTest());
            Thread.sleep(1);
        }
    }

}
