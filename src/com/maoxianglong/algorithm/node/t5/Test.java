package com.maoxianglong.algorithm.node.t5;

import com.maoxianglong.algorithm.node.Node;

/**
 * 24【两两交换链表中的节点】
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 */
public class Test {

    public static Node swapPairs(Node head) {

        Node current = new Node(0);
        Node newNode = current;

        while (head != null) {

            Node n1 = head;
            Node n2 = head.next;

            current.next = n2;
            //n1 和 n2 互换
            n1.next = n2.next;
            n2.next = n1;

            //current往前挪动一位
            current = n2.next;
            head = n1.next;

        }
        return newNode.next;
    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Node nn = swapPairs(node1);
        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }

    }

}
