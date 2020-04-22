package com.maoxianglong.algorithm.node.t4;

import com.maoxianglong.algorithm.node.Node;

/**
 * 23【合并K个排序链表】
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 */
public class Test {

    public static Node mergeKLists(Node[] lists) {

        int minNumber = 9;
        int index = -1;
        int nullCount = 0;
        Node current = new Node(0);
        Node newNode = current;

        boolean flag = true;
        while (flag){
            for (int i = 0; i < lists.length; i++){

                //直到数组所有的元素都是null 说明比较完成
                if (lists[i] == null){
                    nullCount++;
                }

                //找出当前num最小的节点 并记录下标
                if (lists[i] != null){
                    if (lists[i].num < minNumber){
                        minNumber = lists[i].num;
                        index = i;
                    }
                }
            }

            // 将最小num的节点往前挪动一位，其他元素保持不变继续比较
            Node nodeIndex = lists[index];
            if (nodeIndex != null){

                current.next = nodeIndex;
                current = current.next;

                nodeIndex = nodeIndex.next;
                lists[index] = nodeIndex;
            }

            // 所有元素都为null时停止遍历
            if (nullCount == lists.length - 1){
                flag = false;
            }else {
                nullCount = 0;
            }

            // 每轮循环将最小值重置为9
            minNumber = 9;
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

        Node node7 = new Node(2);
        Node node8 = new Node(6);
        Node node9 = new Node(9);

        node7.next = node8;
        node8.next = node9;

        Node[] nodeList = {node1, node4, node7};

        Node nn = mergeKLists(nodeList);

        while (nn != null){
            System.out.print(nn.num);
            nn = nn.next;
        }

    }

}
