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
	
	public Fila<T> cloneFila() {
		int size = this.size();
		Fila<T> cloneFila = new Fila<T>();
		for(int i = 0; i < size; i++) {
			cloneFila.enqueue(this.front().value);
			this.fronToEnd();
		}
		return cloneFila;
	}
	
	public int maiorNum() {
		int maior = (int) this.front().value;
		for(int i = 0; i < this.size(); i++) {
			if((int) this.front().value > maior) {
				maior = (int) this.front().value;
				this.fronToEnd();
			} else {
				this.fronToEnd();
			}
		}
		return maior;
	}
	
	public int menorNum() {
		int menor = (int) this.front().value;
		for(int i = 0; i < this.size(); i++) {
			if((int) this.front().value < menor) {
				menor = (int) this.front().value;
				this.fronToEnd();
			} else {
				this.fronToEnd();
			}
		}
		return menor;
	}
	
	public Fila<T> sortDecresInt(){
		Fila<T> filaAux = this.cloneFila();
		Fila<T> filaDecres = new Fila<T>();
		
		while (filaDecres.size() != this.size()) {
			int maior = filaAux.maiorNum();
			
			while((int) filaAux.front().value != maior) {
				filaAux.fronToEnd();
			}
			filaDecres.enqueue(filaAux.dequeue().value);
			if(filaAux.size() == 1) {
				filaDecres.enqueue(filaAux.dequeue().value);
			}
		}
		
		return filaDecres;
	}
	
	public Fila<T> sortInt(){
		Fila<T> filaAux = this.cloneFila();
		Fila<T> filaDecres = new Fila<T>();
		
		while (filaDecres.size() != this.size()) {
			int menor = filaAux.menorNum();
			
			while((int) filaAux.front().value != menor) {
				filaAux.fronToEnd();
			}
			filaDecres.enqueue(filaAux.dequeue().value);
			if(filaAux.size() == 1) {
				filaDecres.enqueue(filaAux.dequeue().value);
			}
		}
		
		return filaDecres;
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

	}
}
