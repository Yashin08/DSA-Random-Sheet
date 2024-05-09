class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        // Write your code here
        
        Node prevptr = null;
        Node cur = head;
        Node fast = null;
        while(cur != null){
            if(cur.data == x){
                prevptr = cur.prev;
                fast = cur.next;
                if(cur == head){
                    head = head.next;
                    cur = cur.next;
                    fast.prev = null;
                }
                else{
                    prevptr.next = fast;
                }
                
                if(fast == null){
                    prevptr.next = null;
                }
                else{
                    fast.prev = prevptr;
                }
                cur = fast;
            }
            else{
                cur = cur.next;
            }
        }
        return head;
    }
}
