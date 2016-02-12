class Stack<T> implements StackInterface<T> {
	private Node<T> head;
	private int elementCount = 0;

	private class Node<T> {
		T value;
		Node<T> next;
	}

	public void push (T value) {
		Node<T> node = new Node<T>();
		node.value = value;
		node.next = head;

		head = node;
		elementCount++;
	}

	public T pop() {
		if (head == null)
			return null;

		T value = head.value;
		head = head.next;

		elementCount--;

		return value;
	}

	public T peek() {
		if (head == null)
			return null;

		return head.value;
	}

	public boolean isEmpty() {
		if (elementCount == 0)
			return true;

		return false;
	}

	public void clear() {
		elementCount = 0;
		head = null;
	}
}