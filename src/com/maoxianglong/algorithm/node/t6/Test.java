package com.maoxianglong.algorithm.node.t6;

import com.maoxianglong.algorithm.node.Node;

/**
 *  25【K 个一组翻转链表】
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 *
 * k 是一个正整数，它的值小于或等于链表的长度。
 *
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 * 示例 :
 *
 * 给定这个链表：1->2->3->4->5
 *
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 *
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 *
 * 说明 :
 *
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class Test {

    public static Node reverseKGroup(Node head, int k) {

        int temp = k;
        Node current = new Node(0);
        Node newNode = current;

        Node tempNode = new Node(0);
        Node dummay = tempNode;

        Node result = new Node(0);
        Node zz = result;

        boolean flag = true;
        while (flag){
            while (k > 0 && head != null){
                current.next = head;
                current = current.next;
                head = head.next;
                k--;
            }
            current.next = null;

            if (k == 0){
                Node p = newNode;
                tempNode = new Node(0);
                while (p != null){
                    Node a = p.next;
                    p.next = tempNode.next;

                    tempNode.next = p;
                    p = a;
                }
                zz.next = tempNode.next;
                while (zz.next != null){
                    zz = zz.next;
                }
                newNode = current;
                k = temp;
            }else {
                flag = false;
            }
        }

        return result.next;
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

        Node nn = reverseKGroup(node1, 3);
        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }
    }

}
