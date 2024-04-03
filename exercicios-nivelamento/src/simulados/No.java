package simulados;

public class No<T>{
	private T item;
	private No<T> nextItem;
	
	public No(T item) {
		this.item = item;
		this.nextItem = null;
	}
	
	public No(T item, No<T> nextItem) {
		this.item = item;
		this.nextItem = nextItem;
	}
	
	@Override
	public String toString() {
		return "No [item=" + item + ", nextItem=" + nextItem + "]";
	}

	public T getItem() {
		return item;
	}
	public void setItem(T item) {
		this.item = item;
	}
	public No<T> getNextItem() {
		return nextItem;
	}
	public void setNextItem(No<T> nextItem) {
		this.nextItem = nextItem;
	}
}
