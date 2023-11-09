import java.io.*;

public class LoopDetectionLinkedList {

    // Java program to detect loop in a linked list
	Node head; // head of list

	/* Linked list Node*/
	class Node {
		int data;
		Node next;
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	/* Inserts a new Node at front of the list. */
	public void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}

	/**
	 * @return
	 */
	boolean detectLoop()
	{
		Node slow_p = head, fast_p = head.next;
		int flag = 0;
		while (slow_p != null && fast_p != null
			&& fast_p.next != null) {
			slow_p = slow_p.next;
			fast_p = fast_p.next.next;
			if (slow_p == fast_p) {
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Loop Found");
		else
			System.out.println("No Loop");

	// while(slow_p!=fast_p){
	// 	if(fast_p==null || fast_p.next==null)
	// 	{
	// 		return false;
	// 	}
	// 	slow_p = slow_p.next;
	// 	fast_p = fast_p.next.next;
	// 	{
	// 		return true;
	// 	}
	// }
	// }

	}


	 

	/* Driver program to test above functions */
	static void main(String args[])
	{
		LoopDetectionLinkedList llist = new LoopDetectionLinkedList();

		llist.push(20);
		llist.push(4);
		llist.push(15);
		llist.push(10);

		/*Create loop for testing */
		llist.head.next.next.next.next = llist.head;

		llist.detectLoop();
	}
}


