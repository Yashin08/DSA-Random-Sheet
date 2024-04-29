class Solution
{
    /*You are required to complete this method*/
    Node delete(Node head, int k)
    {
	    Node node = head;
	    int count = 1;
	    int val = k;
	    Node fast = null;
	    if(k == 1){
	        return null;
	    }
	    while(node.next != null){
	        if(count == k-1){
	            fast = node.next.next;
	            node.next = fast;
	            k += val;
	            count++;
	        }
	        else{
	            node = node.next;
	            count++;
	        }
	    }	 
	    return head;
    }
}
