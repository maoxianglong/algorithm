package com.maoxianglong.algorithm.node.t99;

import com.maoxianglong.algorithm.node.Node;

public class Test {

    public static Node show(Node head){

        Node curr = new Node(0);
        Node newNode = curr;

        Node p = head;

        while (p != null){

            Node temp = p.next;

            p.next = curr.next;
            curr.next = p;

            p = temp;

        }

        return newNode.next;

    }

    public static Node rever(Node head, int m){

        Node curr = new Node(0);
        Node newNode = curr;

        Node p = head;

        int offset = 1;

        while (p != null){

            if (offset == m){
                Node node = new Node(0);
                node.next = p.next;
                p.next = p.next.next;
                node.next.next = p;
                curr.next = node.next;
                break;
            }else {
                curr.next = p;
                curr = curr.next;
            }
            p = p.next;
            offset++;
        }

        return newNode.next;
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

        Node nn = rever(node1, 2);
        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }
    }

}
