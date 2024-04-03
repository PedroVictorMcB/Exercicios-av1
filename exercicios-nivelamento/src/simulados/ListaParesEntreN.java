package simulados;

import java.util.Scanner;

public class ListaParesEntreN {
	
	private int size;
	private Object[] list;
	private int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ListaParesEntreN listPar = new ListaParesEntreN(N);
		
		listPar.paraReceber(N, 0, sc);
		
		int cont = 0;
//		Object num = 2;
		for(int i = 0; i < N; i++) {
			if(listPar % 2 == 0) {
				cont++;
			}
		}
		
		for (int i = 0; i < N; i++) {
			
		}
		
		
		sc.close();
	}

	public ListaParesEntreN(int size) {
		if(size > 0) {
			this.size = size;
		} else {
			this.size = 1;
		}
		list = new Object[this.size];
		this.i = 0;
	}
	
	public void addItem(Object item) {
		if(this.i < this.size) {
			list[this.i] = item;
			this.i++;
		} else {
			System.out.println("Lista cheia");
		}
	}
	
	public int sizeOf() {
		return this.size;
	}
	
	public Object getIndex(int index) {
		if(index < 0 || index >= this.size) {
			System.out.println("out of boundrys");
		} 
		
		return list[index];
	}
	
	public Object paraReceber(int N, int i, Scanner sc) {
		if(i < N) {
			int num = sc.nextInt();
			this.list[i] = num;
			i++;
			return paraReceber(N, i, sc);
		} else {
			return this.list;
		}
	}
	
//	public static int paraPrintar(int N, int i, Object list) {
//		if(i < N) {
//			i++;
//			return paraPrintar(N, i, list);
//		} else {
//			return 1;
//		}
//	}
//	
	public int paraContar(int N, int i) {
		if(i < N) {
			if(list[i]) {
				
			}
			i++;
			return paraContar(N, i);
		} else {
			return 1;
		}
	}

	
}
