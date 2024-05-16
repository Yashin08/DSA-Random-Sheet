class Solution
{
    
    Node insertAtBeginning(Node head, int x)
    {
        // code here
        if(head ==  null) return new Node(x);
        
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        
        return head;
        
    }
    
    Node insertAtEnd(Node head, int x)
    {
        // code here
         if(head ==  null) return new Node(x);
         
         Node temp = head;
         
         while(temp.next!=null) temp=temp.next;
         
         Node newNode = new Node(x);
         temp.next = newNode;
         
         return head;
         
    }
}
