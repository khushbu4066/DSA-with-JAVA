import java.util.Scanner;

public class tcs {
    static class Node {
        int data;
        Node prev, next;
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static class DoublyLinkedList {
        Node head, tail;
        int size;

        DoublyLinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        void addNode(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            size++;
        }

        void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

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

        Node getMiddleNode() {
            Node slow = head, fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        int getSize(Node node) {
            int size = 0;
            while (node != null) {
                size++;
                node = node.next;
            }
            return size;
        }

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        sc.close();

        DoublyLinkedList list = new DoublyLinkedList();
        for (int i = 0; i < n; i++) {
            list.addNode(x[i]);
        }
        System.out.println("Original list:");
        list.printList();
        list.mergeSort();
        System.out.println("Sorted list from both ends:");
        Node current = list.head;
        while (current != null) {
            System.out.print(current.data);
            current = current.next;
        }
    }
}

       
