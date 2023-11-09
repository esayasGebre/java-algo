package collections;

public class MyStringStack {
	Node Top;

	MyStringStack() {
		Top = new Node(null);
	}

	// push() item to the stack
	public void push(String item) {
		Node n = new Node(item);
		if(Top != null){
			n.next=Top;
			Top=n;
		}else
		Top = n;
	}
	
	// pop() from the stack
	public String pop(){
		String item;
		if(Top == null)return null;
		if(Top.next == null){
			item=Top.value;
			Top=null;
		}
		else{
			item=Top.value;
			Top=Top.next;
		}
		return item;
	}
	
	//peek item from the  top of the stack
	public String peek(){
		return Top.value;
	}
	
	class Node {
		String value;
		Node next;

		Node(String value) {
			this.value = value;
		}
		public String toString() {
			return value == null ? "null" : value;
		}
	}
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Node next = Top;
		while (next != null) {
			sb.append(next.toString() + ", ");
			next = next.next;
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		MyStringStack stack = new MyStringStack(); 
		stack.push("Bob"); 
		stack.push("Harry"); 
		stack.push("Alice"); 

		System.out.println("Popping�"+stack.pop()); 
		System.out.println("Peeking�."+stack.peek()); 
		System.out.println("Popping�"+stack.pop());
		System.out.println("\n....elements in the stack:\n" + stack); 
	}
}

