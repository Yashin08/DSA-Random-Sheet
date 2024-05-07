class Solution
{
    //Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
                break;
            }
            
        }
        if(fast == null || fast.next == null){
            return 0;
        }
        fast = head;
        int count = 1;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }
        fast = fast.next;
        while(fast != slow){
            fast = fast.next;
            count++;
        }
        return count;
    }
}
