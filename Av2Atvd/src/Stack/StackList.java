package Stack;

public class StackList<T> {
	Node<T> head;
	Node<T> tail;
	int length;
	
	StackList(){
		head = null;
		tail = null;
		length = 0;
	}
	
	void push(T value) {
		Node<T> data = new Node<>(value);
		if (head == null && tail == null) {
			head = data;
			tail = head;
		} else {
			Node<T> current = data;
			tail.next = current;
			tail = tail.next;
			
		}
		length++;
	}
	
	T top(){
		if (head == null) {
			return null;
		}
		
		return this.tail.value;
	}
	
	T pop(){
		Node<T> popedElement = this.tail;
		Node<T> current = this.head;
		if (this.length == 1) {
			this.head = null;
			this.tail = null;
		} else {
			while (current.next != this.tail) {
				current = current.next;
			}
			current.next = null;
			this.tail = current;
		}
		
		this.length--;
		
		return popedElement.value;
	}
	
	boolean isEmpty() {
		if (this.length == 0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[]args) {
		StackList<Integer> Stacker = new StackList<>();
		
		int[] nums = {10, 20, 30, 50};
		
		for (int i = 0; i < 4; i++) {
			Stacker.push(nums[i]);
			System.out.println(Stacker.top() + " added to index " + i + " length: " + Stacker.length + "\n");
		}
		
		System.out.println(Stacker.isEmpty());
		
		for (int i = 3; i >= 0; i--) {
			System.out.println(Stacker.pop() + " removed from index " + i + " length: " + Stacker.length);
			System.out.println(Stacker.top() + " new tail defined at index " + i + " length: " + Stacker.length+ "\n");
		}
		
		System.out.println(Stacker.isEmpty());
	}
}
