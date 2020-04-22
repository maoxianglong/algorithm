package com.maoxianglong.algorithm.node.t7;

import com.maoxianglong.algorithm.node.Node;

/**
 *  61【旋转链表】
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 *
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 */
public class Test {

    public static Node rotateRight(Node head, int k) {

        Node p = head;

        Node endNodesIndex = new Node(0);
        Node endNodes = endNodesIndex;

        Node startNodesIndex = new Node(0);
        Node startNodes = startNodesIndex;

        int length = 0;

        while (p != null) {
            p = p.next;
            length++;
        }

        int a = length - (k % length);

        while (head != null) {
            if (a != 0){
                startNodesIndex.next = head;
                startNodesIndex = startNodesIndex.next;
                head = head.next;
                a--;
            }else {
                endNodesIndex.next = head;
                startNodesIndex.next = null;
                break;
            }
        }

        while (endNodesIndex != null && endNodesIndex.next != null){
            endNodesIndex = endNodesIndex.next;
        }

        endNodesIndex.next = startNodes.next;

        return endNodes.next;
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

        Node nn = rotateRight(node1, 7);
        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }

    }

}
