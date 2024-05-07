package lde;

public class PilhaBasedFila<T> {

	private Fila<T> newPilha = new Fila<T>();
	
	void push(T value) {
		this.newPilha.enqueue(value); 
	}
	
	public boolean isEmpty() {
		return this.newPilha.isEmpty();
	}
	
	public int size() {
		return this.newPilha.size();
	}
	
	public T top() {
		if (this.newPilha.isEmpty()) {
			return null;
		} else if(this.newPilha.size() == 1) {
			return this.newPilha.head.value;
		} else {
			T currentTop = this.newPilha.tail.value;
			return currentTop;
		}
	}
	
	public T pop() {
		if(this.newPilha.isEmpty()) {
			return null;
		}
		
		T currentPop = this.newPilha.tail.value;
		while(this.newPilha.head.value != currentPop) {
			this.newPilha.fronToEnd();
		}
		this.newPilha.dequeue();
		
		return currentPop;
	}
	
	public String toString() {
		return this.newPilha.toString();
	}
	
	public static void main(String[] args) {
		

	}

}
