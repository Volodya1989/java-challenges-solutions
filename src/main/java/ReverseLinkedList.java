package src.main.java;

public class ReverseLinkedList extends MergeTwoSortedLists {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode nextTemp = curr.next;
            curr.next=prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
//    recursion method
//    public ListNode reverseList(ListNode head) {
//        if (head == null || head.next == null) return head;
//        ListNode p = reverseList(head.next);
//        head.next.next = head;
//        head.next = null;
//        return p;
//    }
}

