import java.util.Stack;

class StackDemo {
	@SuppressWarnings("removal")
	public static void main(String args[]) { // create an empty stack to contain Integer objects
		Stack<Integer> st = new Stack<Integer>();
		st.push(new Integer(10));
		st.push(new Integer(20));
		st.push(new Integer(30));
		st.push(new Integer(40));
		st.push(new Integer(50));
		System.out.println(st);
		System.out.println("Element at top of the stack is : " + st.peek());
		System.out.println("Removing element at the TOP of the stack : " + st.pop());
		System.out.println("The new stack is : " + st);
	}
}