package alo;

/**
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
//因为是链表是倒叙存储的，所以运算进位等很方便，如果是顺序的呢(咋整啊)
//方法缺点：当前节点为空时，新建当前节点为new ListNode会造成资源损耗，使用最优解的值判断就好。
//重试点：操作的当前指针ref如果指向了null，会丢失与result的关联，导致result不受ref影响
public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode p = l1, q = l2, ref = result;
        int spare = 0;
        while(p!=null||q!=null||spare!=0){
            if (p==null){
                p = new ListNode(0);
            }
            if (q==null){
                q = new ListNode(0);
            }
            if ((p.val+q.val+spare)>9){//愚蠢的进位判断
                ref.val = p.val+q.val+spare-10;
                spare = 1;
            }else {
                ref.val = p.val+q.val+spare;
                spare = 0;
            }
            if (!(p.next==null&&q.next==null&&spare==0)){//如果还有下一次计算，就设置next节点
                ref.next = new ListNode(0);
            }
            p = p.next;
            q = q.next;
            ref = ref.next;
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next= new ListNode(4);
        ListNode result = addTwoNumbers(l1,l2);
        while(result!=null){
            System.out.println(result.val);
            result = result.next;
        }
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}