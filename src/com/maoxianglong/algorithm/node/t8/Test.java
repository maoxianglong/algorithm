package com.maoxianglong.algorithm.node.t8;

import com.maoxianglong.algorithm.node.Node;

/**
 * 82【删除排序链表中的重复元素 II】
 * 给定一个排序链表，删除所有含有重复数字的节点，只保留原始链表中 没有重复出现 的数字。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->3->4->4->5
 * 输出: 1->2->5
 * 示例 2:
 *
 * 输入: 1->1->1->2->3
 * 输出: 2->3
 */
public class Test {

    /**
     * 解题思路
     * 与链表的其他题目类似，为了防止删除头结点的极端情况发生，先创建空结点dummy，使dummy指向传入的head结点。
     * 然后创建cur的指针，指向链表的头部（即dummy）。
     * 接着对cur指针迭代，因为要对比cur(cur最初始的定义指向空结点)指针的下一个结点与下下一个结点的值是否相等，为了防止产生空指针异常，
     * 故退出迭代的条件为：cur.next != null && cur.next.next != null。
     * 在迭代过程中，如果cur.next.val == cur.next.next.val说明此时有重复元素，此时创建一个临时指针temp，指向cur的下一个节点，
     * 即temp指向的第一个重复元素所在的位置。通过while循环去重，去重后，temp指向的是重复元素中的最后一重复元素所在位置。
     * 最后cur.next = temp.next就实现了消除重复元素。
     * 当然，如果为发现重复元素，则直接向后迭代即可。
     * 迭代完成后，返回dummy的next。
     *
     * @param head
     * @return
     */
    public static Node deleteDuplicates(Node head) {

        Node dummy = new Node(0);
        dummy.next = head;
        Node cur = dummy;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.num == cur.next.next.num) {
                Node temp = cur.next;
                // 去重
                while (temp != null && temp.next != null && temp.num == temp.next.num ) {
                    temp = temp.next;
                }
                cur.next = temp.next;
            } else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(4);
        Node node7 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        Node nn = deleteDuplicates(node1);
        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }
    }

}
