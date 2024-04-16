package Stack;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	private int length;
	
	LinkedList(){
		this.head = null;
		this.tail = null;
		this.length = 0;
	}
	
	int size(LinkedList<T> list) {
		return list.length;
	}
}
