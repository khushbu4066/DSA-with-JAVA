class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        next = null;
    }
}

class ReverseLinkedList {
    public ListNode revListNode(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            if (current != null && current.data == -1) {
                break;
            }
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(3);
        head.next = new ListNode(6);
        head.next.next = new ListNode(5);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(6);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next.next.next = new ListNode(-1);

        ReverseLinkedList obj = new ReverseLinkedList();
        ListNode reversedHead = obj.revListNode(head);
        while (reversedHead != null) {
            System.out.print(reversedHead.data + " ");
            reversedHead = reversedHead.next;
        }
    }
}