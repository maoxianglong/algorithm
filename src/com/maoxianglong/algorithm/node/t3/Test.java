package com.maoxianglong.algorithm.node.t3;

import com.maoxianglong.algorithm.node.Node;

/**
 * 21【合并两个有序链表】
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 */
public class Test {

    public static Node mergeTwoLists(Node l1, Node l2) {

        Node p = l1;
        Node q = l2;

        Node current = new Node(0);
        Node newNode = current;

        while (p != null && q != null){
            if (p.num <= q.num){
                current.next = p;
                p = p.next;
            }else {
                current.next = q;
                q = q.next;
            }
            current = current.next;
        }

        if (p != null){
            current.next = p;
        }else {
            current.next = q;
        }
        return newNode.next;

    }

    public static void main(String[] args) {

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(4);

        node1.next = node2;
        node2.next = node3;

        Node node4 = new Node(1);
        Node node5 = new Node(3);
        Node node6 = new Node(4);

        node4.next = node5;
        node5.next = node6;

        Node nn = mergeTwoLists(node1, node4);

        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }

    }

}
