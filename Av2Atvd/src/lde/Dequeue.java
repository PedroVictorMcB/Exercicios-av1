package lde;

public class Dequeue<T> {
	Node<T> head;
	Node<T> tail;
	private int length;
	
	Dequeue(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	int size() {
		return this.length;
	}
	
	boolean isEmpty() {
		if(this.head == null) {
			return true;
		} else {
			return false;
		}
	}
	
	void addLast(T value) {
		Node<T> data = new Node<T>(value);
		if (this.isEmpty()) {
			this.head = data;
			this.tail = head;
		} else {
			Node<T> current = data;
			this.tail.next = current;
			current.prev = this.tail;
			this.tail = current;
			
		}
		this.length++;
	}
	
	void addFirst(T value) {
		Node<T> data = new Node<T>(value);
		if (this.isEmpty()) {
			this.head = data;
			this.tail = head;
		} else {
			Node<T> newHead = new Node<T>(value);
			newHead.next = this.head;
			this.head.prev = newHead;
			this.head = newHead;
		}
		this.length++;
	}
	
	Node<T> removeFirst() {
		if(this.isEmpty()) {
			return null;
		}
		
		Node<T> current = this.head;
		this.head = this.head.next;
		this.head.prev = null;
		
		this.length--;
		return current;
	}
	
	Node<T> removeLast(){
		if(this.isEmpty()) {
			return null;
		}
		
		Node<T> current = this.tail;
		this.tail = this.tail.prev;
		this.tail.next = null;
		
		this.length--;
		return current;
	}
	
	Node<T> first(){
		return this.head;
	}
	
	Node<T> last(){
		return this.tail;
	}
	
	void firsToLast() {
		Node<T> first = this.removeFirst();
		this.addLast(first.value);
	}
	
	void lasToFirst() {
		Node<T> last = this.removeLast();
		this.addFirst(last.value);
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
	
	public static void main(String[] args) {
		int N = 8;
		
		Dequeue<Integer> lista = new Dequeue<>();
		
		for(int i = 1; i <= N; i++) {
			lista.addLast(i);
		}
		System.out.println(lista);
		
		for(int i = 1; i <= N/2; i++) {
			lista.firsToLast();
		}
		System.out.println(lista);
		
		for(int i = N; i > N/2; i--) {
			lista.lasToFirst();
		}
		System.out.println(lista);
	}
}
