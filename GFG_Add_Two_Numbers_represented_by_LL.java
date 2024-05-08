class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node num1, Node num2){
        // code here
        // return head of sum list
        num1 = removeLeadingZeroes(num1);
        num2 = removeLeadingZeroes(num2);
        
        Node head1 = reverseList(num1);
        Node head2 = reverseList(num2);
        
        if((head1.data == 0 && head1.next == null) && (head2.data == 0 && head2.next == null)){
            return head1;
        }
        
        Node temp1 = head1;
        Node temp2 = head2;
        
        Node prev1 = head1;
        
        int carry = 0;
        
        while(temp1 != null && temp2 != null){
            int value = temp1.data + temp2.data + carry;
            carry = value / 10;
            temp1.data = value % 10;
            prev1 = temp1;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        
        while(temp1 == null && temp2 != null){
            int value = temp2.data + carry;
            carry = value/10;
            Node temp = new Node(value % 10);
            prev1.next = temp; 
            prev1 = temp;
            temp2 = temp2.next;
        }
        
        while(temp2 == null && temp1 != null){
            int value = temp1.data + carry;
            carry = value/10;
            temp1.data = value % 10;
            prev1 = temp1;
            temp1 = temp1.next;
        }
        
        if(carry != 0){
            Node temp = new Node(carry);
            prev1.next = temp; 
            prev1 = temp;
        }
        
        num1 = reverseList(head1);
        return num1;
    }
    
    static Node removeLeadingZeroes(Node head){
        while(head.data == 0 && head.next != null){
            head = head.next;
        }
        return head;
    }
    
    static Node reverseList(Node head)
    {
        if(head == null || head.next == null){
            return head;
        }
        Node temp = null;
        Node cur = head;
        Node fast;
        while(cur != null){
            fast = cur.next;
            cur.next = temp;
            temp = cur;
            cur = fast;
        }
        return temp;
    }
}
