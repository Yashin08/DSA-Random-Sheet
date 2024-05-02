class Solution
{
    //Function to reverse a linked list.
    Node reverseList(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
        Node temp = null;
        Node cur = head;
        Node fast;
        while(cur != null){
            fast = cur.next;
            cur.next = temp;
            temp = cur;
            cur = fast;
        }
        return temp;
    }
}
