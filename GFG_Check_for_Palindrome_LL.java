class Solution
{
    //Function to check whether the list is palindrome.
    boolean isPalindrome(Node head) 
    {
        // Hare & Tortoise method to reach mid
        // Then reverse the Linked List and compare
        Node fast = head;
        Node mid = head;
        while(fast != null && fast.next != null){ // Find mid
            mid = mid.next;
            fast = fast.next.next;
        }
        Node cur = mid.next; // Another variable to reverse the next half
        Node tail = mid; // store the last value
        while(cur != null){ // reverse the next half
            fast = cur.next;
            cur.next = tail;
            tail = cur;
            cur = fast;
        }
        while(head != mid){ // start checking
            if(head.data != tail.data){ // if not equal return false
                return false;
            }
            head = head.next;
            tail = tail.next;
        }
        return true;
    }    
}
