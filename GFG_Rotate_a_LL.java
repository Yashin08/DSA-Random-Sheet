class Solution{
    //Function to rotate a linked list.
    public Node rotate(Node head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        Node head1 = head;
        Node head2 = null;
        int i = 1;
        while(i < k && head.next != null){
            head1 = head1.next;
            i++;
        }
        if(head1.next == null){
            return head;
        }
        head2 = head1.next;
        head1.next = null;
        Node temp = head2;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = head;
        return head2;
    }
}
