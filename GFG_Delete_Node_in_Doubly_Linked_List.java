class Solution
{
    // function returns the head of the linkedlist
    Node deleteNode(Node head,int x)
    {
	    int count = 1;
	    Node node = head;
	    if(head == null || head.next == null){
	        return null;
	    }
	    while(node != null){
	        Node nextptr = node.next;
	        Node prevptr = node.prev;
	        if(count == x && nextptr != null && prevptr != null){
	            prevptr.next = nextptr;
	            nextptr.prev = prevptr;
	            return head;
	        }
	        else if(count == x && nextptr == null){
	            prevptr.next = null;
	            return head;
	        }
	        else if(x == 1){
	            nextptr.prev = null;
	            head = nextptr;
	            return head;
	        }
	        node = node.next;
	        count++;
	    }
	    return head;
    }
}
