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
	String signature = "Thomas Nguyen";

	Node head = new Node(null);
	Node pointer = head;
	int size = 0;
	class Node {
		Process process;
		Node next;

		Node(Process p) {
			this.process = p;
			this.next = null;
		}
	}

	@Override
	/**
	 * Inserts the specified element into this queue, if possible
	 * post:	The specified element is added to the rear of this queue
	 * @param	x the element to insert
	 * @return	true if it was possible to add the element
	 * 			to this queue, else false
	 */
	public void offer(Process p) {
		// TODO Implement you code here

		if(!isEmpty()){
			Node new_head = new Node(p);
			pointer.next = new_head;
			pointer = pointer.next;
		}
		else{
			head.process = p;
		}

		size++;
	}

	@Override
	/**
	 * Retrieves and removes the head of this queue,
	 * or null if this queue is empty.
	 * post:	the head of the queue is removed if it was not empty
	 * @return 	the head of this queue, or null if the queue is empty
	 */
	public Process poll() {
		// TODO Implement you code here
		if(isEmpty()){
			return null;
		}
		if(size == 1){
			size--;
			return head.process;

		}
		else{
			Node tmp =  head;
			head = head.next;
			size--;
			return tmp.process;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Implement you code here
		if(size == 0){
			return true;
		}
		return false;
	}

	@Override
	public String getSignature() {
		return signature;
	}

}
