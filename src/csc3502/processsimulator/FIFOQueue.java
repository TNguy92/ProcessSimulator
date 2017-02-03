package csc3502.processsimulator;

/*
 * Homework 2:
 * @Author you name here..
 * Goal: finish the code in each functions to provide a First in first out queue.
 * Note that in this class, no implementations of List in java library are allowed.
 * You could implement a linked list using the class Node below.
 */
public class FIFOQueue implements Queue {

	//put your name as the value of the signature.
	String signature = "Your name here";
	
	Node head = new Node(null);
	Node pointer = head;

	class Node {
		Process process;
		Node next;

		Node(Process p) {
			this.process = p;
			this.next = null;
		}
	}

	@Override
	public void offer(Process p) {
		// TODO Implement you code here
	}

	@Override
	public Process poll() {
		// TODO Implement you code here
		return null;
	}

	@Override
	public boolean isEmpty() {
		// TODO Implement you code here
		return false;
	}

	@Override
	public String getSignature() {
		return signature;
	}
	
}
