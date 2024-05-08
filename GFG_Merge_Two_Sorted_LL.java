class LinkedList {
    // Function to merge two sorted linked lists.
    Node sortedMerge(Node head1, Node head2) {
        // Create a dummy node to simplify the merge process
        Node dummy = new Node(0);
        Node current = dummy;

        while (head1!= null && head2!= null) {
            if (head1.data < head2.data) {
                current.next = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                head2 = head2.next;
            }
            current = current.next;
        }

        // Append the remaining nodes, if any
        current.next = (head1!= null)? head1 : head2;

        return dummy.next;
    }
}
