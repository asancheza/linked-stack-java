/*
 * Stack sample
 * 
 * @author Alejandro Sanchez Acosta
 */

public class StackSample {
	public static void main(String[] args) {
		System.out.println("Linked Stack 1");
		StackInterface<Integer> stack = new LinkedStack<Integer>();
		stack.push(3);
		stack.push(5);

		System.out.println(stack);

		System.out.println(stack.pop());

		System.out.println("Linked Stack 2");
		StackInterface<String> stack2 = new LinkedStack<String>();
		stack2.push("Hello");
		stack2.push("World");
		stack2.push("Hello");
		stack2.push("World");
		stack2.push("Hello");
		stack2.push("World");
		stack2.remove(2);

		System.out.println(stack2.pop());

		stack2.clear();
		
		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}

		System.out.println("Linked Stack 3");
		StackInterface<Integer> stack3 = new LinkedStack<Integer>();
		stack3.queue(3);
		stack3.queue(5);
		stack3.queue(7);
		stack3.queue(9);
		stack3.queue(11);
		stack3.queue(15);

		System.out.println(stack3.pop());

		while (!stack3.isEmpty()) {
			System.out.println(stack3.pop());
		}

		System.out.println("Array stack");
		StackInterface<Integer> astack = new ArrayStack<Integer>();
		astack.push(3);
		astack.push(5);
		astack.push(7);
		astack.push(9);

		System.out.println(astack.pop());
	}
}