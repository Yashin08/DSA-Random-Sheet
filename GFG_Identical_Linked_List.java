class Solution {
    // Function to check whether two linked lists are identical or not.
    public boolean areIdentical(Node head1, Node head2) {
        // write your code here
        while(head1 != null && head2 != null){
            if(head1.data == head2.data){
                head1 = head1.next;
                head2 = head2.next;
            }
            else{
                return false;
            }
        }
        if(head1 == null && head2 != null){
            return false;
        }
        else if(head2== null && head1 != null){
            return false;
        }
        return true;
    }
}
