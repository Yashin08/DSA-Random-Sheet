class Solution {
    public Node arrangeCV(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node vHead = null;
        Node vTail = null;
        Node cHead = null;
        Node cTail = null;

        Node cur = head;
        while (cur != null) {
            Node next = cur.next;
            if (isVowel(cur.data)) {
                if (vHead == null) {
                    vHead = cur;
                    vTail = cur;
                } else {
                    vTail.next = cur;
                    vTail = cur;
                }
            } else {
                if (cHead == null) {
                    cHead = cur;
                    cTail = cur;
                } else {
                    cTail.next = cur;
                    cTail = cur;
                }
            }
            cur.next = null;
            cur = next;
        }

        if (vHead == null) {
            return cHead;
        }

        vTail.next = cHead;
        return vHead;
    }

    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
