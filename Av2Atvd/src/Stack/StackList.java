package Stack;

public class StackList<T> {
	Node<T> head;
	Node<T> tail;
	int length;
	
	public StackList(){
		head = null;
		tail = null;
		length = 0;
	}
	
	public void push(T value) {
		Node<T> data = new Node<>(value);
		if (this.isEmpty()) {
			this.head = data;
			this.tail = this.head;
		} else {
			Node<T> current = data;
			this.tail.next = current;
			this.tail = current;
			
		}
		this.length++;
	}
	
	public T top(){
		if (this.head == null) {
			return null;
		}
		
		return this.tail.value;
	}
	
	public T pop(){
		Node<T> popedElement = this.tail;
		Node<T> current = this.head;
		if (this.length == 1) {
			this.head = null;
			this.tail = null;
		} else {
			while (current != this.tail) {
				current = current.next;
			}
			current.next = null;
			this.tail = current;
		}
		
		this.length--;
		
		return popedElement.value;
	}
	
	public boolean isEmpty() {
		if (this.length == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.length;
	}
	
	public StackList<T> inverse() {
		StackList<T> inverser = new StackList<T>();
		for(int k = 0; k < this.size(); k++) {
			inverser.push(this.pop());
		}
		
		return inverser;
	}
	
	public String toString() {
		String txtOutPut = (String) head.value.toString() + " ";
		
		Node<T> current = head.next;
		while (current != null) {
			txtOutPut += (String) current.value.toString() + " ";
			current = current.next;
		}
		return txtOutPut;
	}
}
