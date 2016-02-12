public class StackSample {
	public static void main(String[] args) {
		System.out.println("Test");

		StackInterface<Integer> stack = new Stack<Integer>();
		stack.push(3);
		stack.push(5);

		System.out.println(stack.pop());

		StackInterface<String> stack2 = new Stack<String>();
		stack2.push("Hello");
		stack2.push("World");
		stack2.push("Hello");
		stack2.push("World");
		stack2.push("Hello");
		stack2.push("World");

		System.out.println(stack2.pop());

		stack2.clear();
		
		while (!stack2.isEmpty()) {
			System.out.println(stack2.pop());
		}

		StackInterface<Integer> stack3 = new Stack<Integer>();
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
	}
}