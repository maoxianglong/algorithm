/**
 * @Author: xianglong
 * @Date: 2020/3/13 3:45 下午
 */
package com.maoxianglong.algorithm.node.t16;

import com.maoxianglong.algorithm.node.Node;

import java.util.HashMap;

/**
 * @Author: mxl
 * @Date: 2020/3/13 3:45 下午
 */
public class Test {

    public static void testHashMapResize(Node head){

        Node a = head;
        while (head != null){
            head.num = 9;
            head = head.next;
        }

        while (a != null){
            System.out.println(a.num);
            a = a.next;
        }

    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        testHashMapResize(node1);
    }

}
