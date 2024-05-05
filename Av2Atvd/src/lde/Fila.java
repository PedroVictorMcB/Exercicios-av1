package lde;

public class Fila<T> {
	Node<T> head;
	Node<T> tail;
	private int length;
	
	Fila(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	int size() {
		return this.length;
	}
	
	void enqueue(T value) {
		Node<T> data = new Node<T>(value);
		if (this.isEmpty()) {
			this.head = data;
			this.tail = head;
		} else {
			Node<T> current = data;
			this.tail.next = current;
			this.tail = current;
		}
		this.length++;
	}
	
	Node<T> dequeue() {
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
	
	void fronToEnd() {
		Node<T> front = this.dequeue();
		this.enqueue(front.value);
	}
	
	public String toString() {
		StringBuilder strDisplay = new StringBuilder("");
		Node<T> current = head;
		while (current.next != null) {
			strDisplay.append(current.value + ", ");
			current = current.next;
		}
		strDisplay.append(current.value + "");
		
		return strDisplay.toString();
	}
	
	public static void main(String[] args) {

	}
}
