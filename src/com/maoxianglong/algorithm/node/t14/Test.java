/**
 * @Author: xianglong
 * @Date: 2020/3/11 3:46 下午
 */
package com.maoxianglong.algorithm.node.t14;

import com.maoxianglong.algorithm.node.Node;

/**
 * @Author: mxl
 * @Date: 2020/3/11 3:46 下午
 */
public class Test {
    public static Node removeElements(Node head, int val) {
        Node sentinel = new Node(0);
        sentinel.next = head;

        // prve和curr都只是一个指针
        Node prev = sentinel;
        Node curr = head;
        while (curr != null) {
            if (curr.num == val) {
                prev.next = curr.next;
            }else{
                prev = curr;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }

    public static Node removeElements2(Node head, int val) {
        Node prev = new Node(0);
        Node sentinel = prev;
        Node curr = head;
        while (curr != null) {
            if (curr.num == val) {
//                prev.next = curr.next;
            }else{
                prev.next = curr;
                prev = prev.next;
            }
            if (curr.next == null && curr.num == val){
                prev.next = null;
                break;
            }
            curr = curr.next;
        }
        return sentinel.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(6);
        Node node2 = new Node(2);
        Node node3 = new Node(6);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(6);
        Node node7 = new Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;

        Node nn = removeElements2(node1, 6);

        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }
    }
}
