class Solution {
    public ListNode doubleIt(ListNode head) {
        int carry = 0;
        ListNode tail = reverseList(head);
        ListNode temptail = tail;
        ListNode prev = tail;
        while(temptail != null){
            int value = (temptail.val * 2) + carry;
            carry = value / 10;
            temptail.val = value % 10;
            prev = temptail;
            temptail = temptail.next;
        }

        if(carry != 0){
            ListNode temp = new ListNode(carry);
            prev.next = temp;
            temptail = temp;
        }

        head = reverseList(tail);
        return head;
    }

    ListNode reverseList(ListNode head)
    {
        if(head == null || head.next == null){
            return head;
        }
        ListNode temp = null;
        ListNode cur = head;
        ListNode fast;
        while(cur != null){
            fast = cur.next;
            cur.next = temp;
            temp = cur;
            cur = fast;
        }
        return temp;
    }
}
