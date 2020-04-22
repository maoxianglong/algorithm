package com.maoxianglong.algorithm.node.t2;

import com.maoxianglong.algorithm.node.Node;

/**
 * 19【删除链表的倒数第N个节点】
 *
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 * 说明：
 * 给定的 n 保证是有效的。
 *
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 */
public class Test {

    public static Node removeNthFromEnd1(Node head, int n) {

        Node newNode = new Node(0);
        Node current = newNode;
        Node p = head;
        Node calNode = head;
        //记录链表的总长度
        int index = 0;

        while (p != null){
            index++;
            p = p.next;
        }

        int delIndex = index - n;

        while (delIndex != 0){
            Node temp = calNode.next;

            // 如果不是倒数第N个则直接放到新的链表后面
            current.next = calNode;
            current = current.next;

            calNode = temp;
            delIndex--;
        }

        //跳过需要删除的节点
        current.next = current.next.next;
        return newNode.next;
    }

    public static Node removeNthFromEnd2(Node head, int n) {

        Node newNode = new Node(0);
        Node current = newNode;
        Node p = head;
        Node calNode = head;
        //记录链表的总长度
        int index = 0;

        while (p != null){
            index++;
            p = p.next;
        }

        while (calNode != null){
            Node temp = calNode.next;

            if (index != n){
                current.next = calNode;
                current = current.next;
            }

            calNode = temp;
            index--;
        }
        return newNode.next;
    }

    /**
     * 只需要一次迭代
     * @param head
     * @param n
     * @return
     */
    public static Node removeNthFromEnd3(Node head, int n) {

        Node first = head;
        Node second = head;

        for (int i = 0; i < n; i++){
            first = first.next;
        }

        Node temp = second;
        while (first != null){
            first = first.next;
            second = second.next;

        }
        second.next = second.next.next;
        return temp;

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

//        Node nn = removeNthFromEnd1(node1, 3);
//        Node nn = removeNthFromEnd2(node1, 3);
        Node nn = removeNthFromEnd3(node1, 3);
        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }
    }

}
