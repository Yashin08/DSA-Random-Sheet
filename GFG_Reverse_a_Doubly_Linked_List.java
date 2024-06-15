public static Node reverseDLL(Node  head)
{
    Node node = head;
    Node prevptr = null;
    Node nextptr;
    while(node != null){
        nextptr = node.next;
        node.next = prevptr; //update both the values of a single node
        node.prev = nextptr; //update both the values of a single node
        prevptr = node; //update the nodes
        node = nextptr; 
    }
    return prevptr;
}
