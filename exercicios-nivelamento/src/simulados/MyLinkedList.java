package simulados;

public class MyLinkedList<T> {

	private No<T> inicio;
	private No<T> ultimo;
	private int size;
	
	public void addItem(T item) {
		No<T> cell = new No<T>(item);
		if(this.size == 0) {
			this.inicio = cell;
		} else {
			this.ultimo.setNextItem(cell);
		}
		this.ultimo = cell;
		this.size++;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder("[");
//		builder.append("ListaEncadeada [inicio=").append(inicio).append("]");
		No<T> atual = this.inicio;
		
		for(int i = 0; i < this.size-1; i++) {
			builder.append(atual.getItem()).append(", ");
			atual = atual.getNextItem();
		}
		builder.append(atual.getItem()).append("]");
		
		return builder.toString();
	}
}
