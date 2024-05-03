class GfG
{
    //Function to insert a new node at given position in doubly linked list.
    void addNode(Node head_ref, int pos, int data)
	{
		int count = 0;
		Node node = head_ref;
		Node insert = new Node(data);
		while(node != null){
		    if(count == pos && node.next != null){
		        Node nextptr = node.next;
		        node.next = insert;
		        insert.prev = node;
		        insert.next = nextptr;
		        nextptr.prev = insert;
		    }
		    else if(node.next == null && count == pos){
		        node.next = insert;
		        insert.prev = node;
		    }
		    node = node.next;
		    count++;
		}
	}
}
