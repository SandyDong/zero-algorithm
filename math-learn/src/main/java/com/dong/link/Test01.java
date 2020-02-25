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

        ListNode listNode4 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);listNode3.next = listNode4;
        ListNode listNode2 = new ListNode(2);listNode2.next = listNode3;
        ListNode listNode1 = new ListNode(1);listNode1.next = listNode2;

    }

    /**
     * 删除指定的节点元素
     * @param listNode
     */
    public static void  deleteTargetNode(ListNode listNode){
        //是末尾节点
        if(listNode.next == null){
            return;
        }
        //是头节点
        listNode.val = listNode.next.val;
        listNode.next = listNode.next.next;
    }

}

//链表节点定义
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}