class Solution {
    // Function to remove a loop in the linked list.
    public static void removeLoop(Node head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head;

        // Find the meeting point, i.e., the entrance to the loop
        while (fast!= null && fast.next!= null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }

        // If there's no loop, the slow and fast pointers will never meet
        if (fast == null || fast.next == null) {
            return;
        }

        // Move the slow pointer to the head and keep the fast pointer at the meeting point
        slow = head;

        // Move both pointers one step at a time until they meet at the node before the loop
        if(slow != fast){    
            while (slow.next != fast.next) {
                slow = slow.next;
                fast = fast.next;
            }
            fast.next = null; // break the loop
        }
        else{
            while(fast.next != slow){
                fast = fast.next;
            }
            fast.next = null; // break the loop
        }
    }
}
