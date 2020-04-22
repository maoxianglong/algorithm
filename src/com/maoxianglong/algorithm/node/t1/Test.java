package com.maoxianglong.algorithm.node.t1;

import com.maoxianglong.algorithm.node.Node;

/**
 * 2【两数相加】
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Test {

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(8);
        Node node3 = new Node(2);

        node1.next = node2;
        node2.next = node3;

        Node node4 = new Node(2);
        Node node5 = new Node(8);
        Node node6 = new Node(3);

        node4.next = node5;
        node5.next = node6;

        Node node7 = addTwoNumbers(node1, node4);
        Node p = node7;
        Node newNode = new Node(0);
        while (p != null){
            Node tempNode = p.next;
            p.next = newNode.next;
            newNode.next = p;
            p = tempNode;
        }

        Node n2 = newNode.next;
        while (n2 != null){
            System.out.print(n2.num);
            n2 = n2.next;
        }

    }

    public static Node addTwoNumbers(Node n1, Node n2) {

        Node n3 = new Node(0);
        Node current = n3;
        int sum;

        // 偏移量 要么等与0 要么等与1 因为
        int offset = 0;

        while (n1 != null && n2 != null){
            int x = n1.num;
            int y = n2.num;
            sum = x + y + offset;
            offset = sum / 10;
            Node node = new Node(sum % 10);
            current.next = node;
            current = current.next;
            n1 = n1.next;
            n2 = n2.next;

        }

        if (offset == 1){
            Node nn = new Node(offset);
            current.next = nn;
        }

        return n3.next;

    }

}
