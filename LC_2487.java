class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode tail = reverse(head);
        ListNode temp1 = tail;
        ListNode temp2 = tail.next;
        int max = tail.val;
        while(temp2 != null){
            if(temp2.val < max){
                temp1.next = temp1.next.next;
                temp2 = temp2.next;
            }
            else{
                max = temp2.val;
                temp2 = temp2.next;
                temp1 = temp1.next;
            }
        }

        head = reverse(tail);
        return head;
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode cur = head;
        ListNode nextptr;
        while(cur != null){
            nextptr = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextptr;
        }
        return prev;
    }
}
