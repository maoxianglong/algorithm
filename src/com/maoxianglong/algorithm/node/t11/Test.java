package com.maoxianglong.algorithm.node.t11;

import com.maoxianglong.algorithm.node.Node;

/**
 * 92 反转链表 II
 * 反转从位置 m 到 n 的链表。请使用一趟扫描完成反转。
 *
 * 说明:
 * 1 ≤ m ≤ n ≤ 链表长度。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL, m = 2, n = 4
 * 输出: 1->4->3->2->5->NULL
 */
public class Test {

    public static Node reverseBetween(Node head, int m, int n) {

        Node dmy = new Node(0);
        dmy.next = head;
        int delta = n-m;
        Node pre = dmy;
        Node tail = head;
        //先定位出m节点和m之前的节点
        while(m>1){
            pre = tail;
            tail = tail.next;
            m--;
        }
        while(delta > 0){
            Node p = tail.next;
            tail.next = p.next;//tail一直不变，只要修改指针到next.next

            //置于头部
            p.next = pre.next;//next.next指向pre的next，也就是最新的第m个位置
            pre.next = p;//更新next为最新的第m个位置

            delta --;
        }

        return dmy.next;
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

        Node nn = reverseBetween(node1, 2,4);
        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }
    }

}
