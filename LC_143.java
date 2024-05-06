class Solution {
    public void reorderList(ListNode head) {
        // using the concept of palindrome 
        // reverse LL after mid, so that it makes it easier to traverse from the tail
        // make a loop with Head and Tail, and add Tail node after Head node and iterate
        // until head != mid

        ListNode fast = head;
        ListNode mid = head;
        while(fast != null && fast.next != null){ // Find mid
            mid = mid.next;
            fast = fast.next.next;
        }
        ListNode cur = mid.next; // Another variable to reverse the next half
        ListNode tail = mid; // store the last value
        while(cur != null){ // reverse the next half
            fast = cur.next;
            cur.next = tail;
            tail = cur;
            cur = fast;
        }

        while(head != mid){
            ListNode tempnext = head.next;
            ListNode tailnext = tail.next;
            head.next = tail;
            tail.next = tempnext;
            tail = tailnext;
            head = head.next.next;
        }
        head.next = null;
    }
}
