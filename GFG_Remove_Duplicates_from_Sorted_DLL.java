class Solution{
    Node removeDuplicates(Node head){
        // Code Here.
        if(head == null || head.next == null){
            return head;
        }
        Node prevptr = head;
        Node temphead = head.next;
        Node fast = null;
        while(temphead != null){
            fast = temphead.next;
            if(temphead.data == prevptr.data){
                prevptr.next = fast;
                if(fast != null){
                    fast.prev = prevptr;
                }
                
                temphead = fast;
            }
            else{
                temphead = temphead.next;
                prevptr = prevptr.next;
            }
        }
        return head;
    }
}
