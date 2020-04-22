/**
 * @Author: xianglong
 * @Date: 2020/4/8 9:56 上午
 */
package com.maoxianglong.algorithm.node.t98;

/**
 * @Author: mxl
 * @Date: 2020/4/8 9:56 上午
 *
 * NameAndType 【方法名 方法描述符】【字段名 字段描述符（字段类型）】
 * 确认一个方法需要三个元素：方法属于哪个类或接口，方法描述符，方法名称
 * 确认一个字段需要三个元素：字段属于哪个类或接口，字段描述符，字段名称
 *
 * 12 + 4 + 8 = 24
 */
public class TestClass {

    private int m;
    private long a;
    private final int b = 8;
    private String s = "maoxianglong";

    public void ins(){
        int n = 1;
        n = m + n;
        Test test = new Test();
    }

}
