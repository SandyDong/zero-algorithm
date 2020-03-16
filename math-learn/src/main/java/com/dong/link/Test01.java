package com.dong.link;

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
 * <p>
 * 输入: head = [4,5,1,9], node = 5
 * 输出: [4,1,9]
 * 解释: 给定你链表中值为 5 的第二个节点，那么在调用了你的函数之后，该链表应变为 4 -> 1 -> 9.
 * <p>
 * 链表至少包含两个节点。
 * 链表中所有节点的值都是唯一的。
 * 给定的节点为非末尾节点并且一定是链表中的一个有效节点。
 * 不要从你的函数中返回任何结果。
 */
public class Test01 {


    public static void main(String[] args) {

        Node node4 = new Node(4);
        Node node3 = new Node(3);node3.next = node4;
        Node node2 = new Node(2);node2.next = node3;
        Node node1 = new Node(1);node1.next = node2;
        deleteTargetNode(node3);
        //头节点为默认初始值
        Node next = node1;
        //测试删除
        for (int i = 0; i < 4  ; i++) {
            if(i==0){
                //默认node1为头节点
                System.out.println("The value of first node is " + next.val);
            }else{
                next = next.next;
                if (next == null){
                    break;
                }
                System.out.println("第"+(i+1)+"节点值为："+ next.val);
            }

        }

    }

    /**
     * 删除指定的节点元素
     * @param Node
     */
    public static void  deleteTargetNode(Node Node){
        //是末尾节点
        if(Node.next == null){
            return;
        }
        //是非末尾节点
        Node.val = Node.next.val;
        Node.next = Node.next.next;
    }

}
