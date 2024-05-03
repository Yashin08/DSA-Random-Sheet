class GfG
{
    public static Node sortedInsert(Node head, int x)
    {
        Node node = head;
        Node insert = new Node(x);
        if(head == null){
            return insert;
        }
        if(node.prev == null && node.data > x){
            insert.next = node;
            node.prev = insert;
            head = insert;
            return head;
        }
        while(node != null){
            if(node.next != null && node.data <= x && node.next.data > x){
                Node nextptr = node.next;
                node.next = insert;
                insert.next = nextptr;
                insert.prev = node;
                nextptr.prev = insert;
                return head;
            }
            else if(node.next == null && node.data <= x){
                node.next = insert;
                insert.prev = node;
                return head;
            }
            else if(node.next == null && node.prev == null && node.data > x){
                insert.next = node;
                node.prev = insert;
                head = insert;
                return head;
            }
            
            node = node.next;
        }
        return head;
    }
}
