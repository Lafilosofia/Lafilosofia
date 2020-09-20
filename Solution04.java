package solution;

import java.util.Stack;

/**
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */

/*栈的特点是后进先出，即最后压入栈的元素最先弹出。考虑到栈的这一特点，使用栈将链表元素顺序倒置。
从链表的头节点开始，依次将每个节点压入栈内，然后依次弹出栈内的元素并存储到数组中。

1.创建一个栈，用于存储链表的节点
2.创建一个指针，初始时指向链表的头节点
3.当指针指向的元素非空时，重复下列操作：
将指针指向的节点压入栈内
将指针移到当前节点的下一个节点
获得栈的大小 size，创建一个数组 print，其大小为 size
创建下标并初始化 index = 0
4.重复 size 次下列操作：
5.从栈内弹出一个节点，将该节点的值存到 print[index]
6.将 index 的值加 1
7.返回 print
*/
    class ListNode{
        int val;
        ListNode next;
        ListNode(int x){val = x;}
}

public class Solution04 {
    public int[] reversePrint(ListNode head){
        Stack<ListNode> stack = new Stack<ListNode>();
        ListNode temp = head;
        while (temp != null){
            stack.push(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] print = new int[size];
        for (int i = 0;i < size;i ++){
            print[i] = stack.pop().val;
        }
        return print;
    }
}
