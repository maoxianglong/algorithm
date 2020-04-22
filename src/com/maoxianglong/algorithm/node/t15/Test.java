/**
 * @Author: xianglong
 * @Date: 2020/3/11 6:42 下午
 */
package com.maoxianglong.algorithm.node.t15;

import com.maoxianglong.algorithm.node.Node;

/**
 * @Author: mxl
 * @Date: 2020/3/11 6:42 下午
 */
public class Test {

    public static boolean isPalindrome(Node head) {
        if(head == null || head.next == null){
            return true;
        }

        Node fast = head;
        Node slow = head;

        Node newNode = new Node(0);

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        while(slow != null){
            Node temp = slow.next;
            slow.next = newNode.next;
            newNode.next = slow;
            slow = temp;
        }

        newNode = newNode.next;
        while(newNode != null && head != null){
            if(newNode.num != head.num){
                return false;
            }
            newNode = newNode.next;
            head = head.next;
        }
        return true;
    }

    public static void main(String[] args) {

        Node node1 = new Node(-129);
        Node node2 = new Node(-129);

        node1.next = node2;

        System.out.println(isPalindrome(node1));

    }

}
