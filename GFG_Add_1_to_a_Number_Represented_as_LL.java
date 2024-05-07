class Solution
{
    public static Node addOne(Node head) 
    { 
        if(head.next == null && head.data == 0){
            head.data = 1;
            return head;
        }
        Node tail = reverseList(head);
        Node temptail = tail;
        int carry = 1;
        while(temptail != null && carry != 0){
            int value = temptail.data + carry;
            carry = value / 10;
            temptail.data = value % 10;
            if(temptail.next != null){
                temptail = temptail.next;
            }
            else if(carry == 1 && temptail.next == null){
                Node temp = new Node(1);
                temptail.next = temp;
                temp.next = null;
                temptail = null;
            }
        }
        
        Node teamphead = reverseList(tail);
        return teamphead;
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
