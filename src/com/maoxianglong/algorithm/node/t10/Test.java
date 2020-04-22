package com.maoxianglong.algorithm.node.t10;

import com.maoxianglong.algorithm.node.Node;

public class Test {

    public static Node partition(Node head, int x) {

        Node before_head = new Node(0);
        Node before = before_head;
        Node after_head = new Node(0);
        Node after = after_head;


        while (head != null){

            if (head.num >= x){
                after.next = head;
                after = after.next;
            }else {
                before.next = head;
                before = before.next;
            }
            head = head.next;
        }

        after.next = null;

        before.next = after_head.next;

        return before_head.next;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(3);
        Node node5 = new Node(4);
        Node node6 = new Node(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        Node nn = partition(node1, 3);
        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }
    }

}
