class GfG
{
    //Function to remove duplicates from sorted linked list.
    Node removeDuplicates(Node head)
    {
	    Node temphead = head;
	    Node ptr = head;
	    if(temphead == null || temphead.next == null){
	        return head;
	    }
	    while(ptr != null){
	        if(temphead.data == ptr.data && ptr.next != null){
	            ptr = ptr.next;
	        }
	        else if(temphead.data == ptr.data && ptr.next == null){
	            temphead.next = null;
	            ptr = ptr.next;
	        }
	        else if(temphead.data != ptr.data && temphead.next != ptr){
	                temphead.next = ptr;
	                temphead = temphead.next;
	                ptr = ptr.next;
	        }
	        else{
	            temphead = temphead.next;
	            ptr = ptr.next;
	        }
	    }
	    return head;
    }
}
