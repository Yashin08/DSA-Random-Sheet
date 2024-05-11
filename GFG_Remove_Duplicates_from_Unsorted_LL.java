class Solution
{
    //Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) 
    {
        HashSet<Integer> hs = new HashSet<>();
        Node prevptr = null;
        Node fast = null;
        Node cur = head;
        int num = 0;
        
        while(cur != null){
            fast = cur.next;
            num = cur.data;
            if(hs.contains(num)){
                if(fast != null){
                    prevptr.next = fast;
                    cur = fast;
                }
                else{
                    prevptr.next = null;
                    cur = cur.next;
                }
            }
            else{
                num = cur.data;
                hs.add(num);
                prevptr = cur;
                cur = cur.next;
            }
        }
        
        return head;
    }
}
