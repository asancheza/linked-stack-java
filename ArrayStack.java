/*
 * Stack class
 * 
 * @author Alejandro Sanchez Acosta
 */

class ArrayStack<T> implements StackInterface<T> {
	public T[] data;
	private int count;
	public static final int CAPACITY = 4;

	public ArrayStack() {
		this.data = (T[]) new Object[CAPACITY];
		this.count = 0;
	}

	/*
	 * Push value to stack
	 */
	public void push (T value) {
		if (count == data.length) {
			this.doubleArrayCapacity();
		}

		this.data[count] = value;
		this.count++;
	}

	public void queue (T value) {

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
	 * Pop value from stack
	 */
	public T pop() {
		count--;

		return this.data[count-1];
	}
   
  /*
   * Returns top value in stack
   */
	public T peek() {
		return this.data[count-1];
	}

	/*
	 * Returns the element below the top element, or throws an 
	 * exception if there are less than two elements
   */
	public T peek2() {
		if (count <= 2)
			throw new IllegalArgumentException("Not enough elements");
		
		return data[count-2];
	}

	/*
	 * Check if stack is empty
   */
	public boolean isEmpty() {
		if (count == 0)
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
		count = 0;
	}

  /* 
   * Print in a string all the values from stack
   */
	public String toString() {
		String str = "";

		for (int i = 0; i < count; i++) {
			str = str.concat(data[i].toString());
		}

		return str;
	}

	private void doubleArrayCapacity() {
		@SuppressWarnings("unchecked")
		T[] copy = (T[]) new Object[this.data.length * 2];

		for (int i = 0; i < count; i++) {
			copy[i] = this.data[i];
		}

		this.data = copy;

		System.out.println("Doubled capacity: "+ data.length * 2);
	}
}