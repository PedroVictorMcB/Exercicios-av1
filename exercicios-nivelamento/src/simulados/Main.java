package simulados;

public class Main {

	public static void main(String[] args) {
		MyLinkedList<Integer> lista = new MyLinkedList<>();
		lista.addItem(1);
		lista.addItem(2);
		lista.addItem(3);
		
		
		System.out.println(lista.getSize());
		System.out.println(lista);
	}

}