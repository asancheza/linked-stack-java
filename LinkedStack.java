/*
 * Stack class
 * 
 * @author Alejandro Sanchez Acosta
 */

class LinkedStack<T> implements StackInterface<T> {
	private Node<T> head;
	private Node<T> tail;
	private int elementCount = 0;

  /* 
   * Node class
   */
	private class Node<T> {
		T value;
		Node<T> next;
	}

	/*
	 * Push value to stack
	 */
	public void push (T value) {
		Node<T> node = new Node<T>();
		node.value = value;
		node.next = head;

		head = node;
		elementCount++;
	}

	/*
	 * Push all values into stack
	 */
	public void pushAll (T[] value) {
		for (int i = 0; i < value.length; i++) {
			push(value[i]);
		}
	}

	/*
	 * Queue in stack
	 */
	public void queue (T value) {
		Node<T> node = new Node<T>();
		Node<T> temp = head;

		node.value = value;

		if (!isEmpty()) {
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		} else {
			head = node;
		}

		elementCount++;
	}

	/*
	 * Pop value from stack
	 */
	public T pop() {
		if (head == null)
			return null;

		T value = head.value;
		head = head.next;

		elementCount--;

		return value;
	}
   
  /*
   * Returns top value in stack
   */
	public T peek() {
		if (head == null)
			return null;

		return head.value;
	}

	/*
	 * Returns the element below the top element, or throws an 
	 * exception if there are less than two elements
   */
	public T peek2() {
		if (elementCount <= 2)
			throw new IllegalArgumentException("Not enough elements");
		
		if (head == null || head.next == null)
			return null;

		if (head.next != null)
			return head.next.value;

		return null;
	}

	/*
	 * Check if stack is empty
   */
	public boolean isEmpty() {
		if (elementCount == 0)
			return true;

		return false;
	}

	/*
	 * Remove n elements from stack
	 */
	public void remove(int n) {
		for (int i=0; i<n; i++) {
			pop();
		}
	}

  /*
   * Clear stack
   */
	public void clear() {
		elementCount = 0;
		head = null;
	}

  /* 
   * Print in a string all the values from stack
   */
	public String toString() {
		Node<T> temp = head;
		String str = "";   

		while (temp != null) {
			str = str.concat(temp.value.toString());
			temp = temp.next;
		}

		return str;
	}
}