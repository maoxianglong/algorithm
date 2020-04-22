/**
 * @Author: xianglong
 * @Date: 2020/3/19 12:11 下午
 */
package com.maoxianglong.algorithm.node.t98;

import com.maoxianglong.algorithm.node.Node;

/**
 * @Author: mxl
 * @Date: 2020/3/19 12:11 下午
 */
public class TestListNode {

    public static Node test(Node node){

        Node fast = node;
        Node slow = node;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
        }

        return node;

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

        Node nn = test(node1);

        while (nn != null){
            System.out.println(nn.num);
            nn = nn.next;
        }
    }

}
