package Stack;

public class PilhaList<T> {
	Node<T> head;
	private int length;
	
	public PilhaList(){
		head = null;
		length = 0;
	}
	
	public void push(T value) {
		Node<T> data = new Node<>(value);
		if (this.isEmpty()) {
			this.head = data;
		} else {
			Node<T> current = data;
			current.next = this.head;
			this.head = current;
			
		}
		this.length++;
	}
	
	public T top(){
		if (this.isEmpty()) {
			return null;
		}
		
		return this.head.value;
	}
	
	public T pop(){
		Node<T> popedElement = this.head;
		if(this.isEmpty()) {
			return null;
		} else {
			this.head = this.head.next;
		}
		
		this.length--;
		
		return popedElement.value;
	}
	
	public boolean isEmpty() {
		if (this.head == null) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.length;
	}
	
	public PilhaList<T> inverse() {
		PilhaList<T> inverser = new PilhaList<T>();
		while(!this.isEmpty()) {
			inverser.push(this.pop());
		}
		
		return inverser;
	}
	
	public String toString() {
		String txtOutPut = "";
		
		Node<T> current = this.head;
		while (current != null) {
			txtOutPut += (String) current.value.toString() + " ";
			current = current.next;
		}
		return txtOutPut;
	}
}
