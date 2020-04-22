package com.maoxianglong.algorithm.node.t13;

import com.maoxianglong.algorithm.node.Node;

public class Test {

    public static Node detectCycle(Node head) {

        if(head == null || head.next == null){
            return null;
        }

        Node p = head;
        Node slow = head;
        Node fast = head.next;
        while(fast != slow){
            if (fast == null || fast.next == null) {
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
        }

        if(slow == null){
            return null;
        }

        slow = slow.next;
        while(slow != p){
            slow = slow.next;
            p = p.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n2;

        Node nn = detectCycle(n1);

        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }

    }

}
