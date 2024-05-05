package lde;

public class LinkedDouble<T> {
	Node<T> head;
	Node<T> tail;
	private int length;
	
	LinkedDouble(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	int size() {
		return this.length;
	}
	
	void add(T value) {
		Node<T> data = new Node<T>(value);
		if (head == null && tail == null) {
			this.head = data;
			this.tail = head;
		} else {
			Node<T> current = data;
			this.tail.next = current;
			current.prev = this.tail;
			this.tail = this.tail.next;
			
		}
		this.length++;
	}
	
	Node<T> remove() {
		if(this.isEmpty()) {
			return null;
		}
		
		Node<T> current = this.head;
		this.head = this.head.next;
		
		this.length--;
		return current;
	}
	
	Node<T> front(){
		return this.head;
	}
	
	boolean isEmpty() {
		if(this.head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	public String toString() {
		StringBuilder strDisplay = new StringBuilder("");
		Node<T> current = head;
		while (current.next != null) {
			strDisplay.append(current.value + " ");
			current = current.next;
		}
		strDisplay.append(current.value + "");
		
		return strDisplay.toString();
	}
}
