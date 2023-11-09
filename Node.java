public class Node {
        int data;
        Node prev;
        Node next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
    
    public class DoublyLinkedList {
        Node head;
        Node tail;
        int size;
    
        // Constructor to initialize an empty doubly linked list
        DoublyLinkedList() {
            head = null;
            tail = null;
            size = 0;
        }
    
        // Method to add a new node at the end of the doubly linked list
        void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }
    
        // Method to print the doubly linked list from head to tail
        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }
    
        // Method to sort the doubly linked list using merge sort
        void mergeSort() {
            if (head == null || head.next == null) {
                return;
            }
            DoublyLinkedList leftList = new DoublyLinkedList();
            DoublyLinkedList rightList = new DoublyLinkedList();
            Node middle = getMiddleNode();
            leftList.head = head;
            leftList.tail = middle;
            leftList.size = getSize(leftList.head);
            rightList.head = middle.next;
            rightList.tail = tail;
            rightList.size = getSize(rightList.head);
            leftList.mergeSort();
            rightList.mergeSort();
            merge(leftList, rightList);
        }
    
        // Helper method to get the middle node of the doubly linked list
        Node getMiddleNode() {
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }
    
        // Helper method to get the size of a doubly linked list
        int getSize(Node node) {
            int size = 0;
            while (node != null) {
                size++;
                node = node.next;
            }
            return size;
        }
    
        // Helper method to merge two sorted doubly linked lists
        void merge(DoublyLinkedList leftList, DoublyLinkedList rightList) {
            Node left = leftList.head;
            Node right = rightList.head;
            DoublyLinkedList mergedList = new DoublyLinkedList();
            while (left != null && right != null) {
                if (left.data < right.data) {
                    mergedList.addNode(left.data);
                    left = left.next;
                } else {
                    mergedList.addNode(right.data);
                    right = right.next;
                }
            }
            while (left != null) {
                mergedList.addNode(left.data);
                left = left.next;
            }
            while (right != null) {
                mergedList.addNode(right.data);
                right = right.next;
            }
            head = mergedList.head;
            tail = mergedList.tail;
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addNode(3);
        list.addNode(5);
        list.addNode(1);
        list.addNode(4);
        list.addNode(2);
        System.out.println("Original list:");
       
    }
}


    
