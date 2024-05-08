class GfG
{
    Node deleteNode(Node head, int x)
    {
		if(head == null || head.next == null){
		    return head;
		}
		if(x == 1){
		    head = head.next;
		    return head;
		}
		int count = 1;
		Node cur = head;
		Node fast = null;
		Node prev = null;
		
		while(cur != null){
		    if(count == x){
		        fast = cur.next;
		        prev.next = fast;
		        return head;
		    }
		    prev = cur;
		    cur = cur.next;
		    count++;
		}
		return head;
    }
}
