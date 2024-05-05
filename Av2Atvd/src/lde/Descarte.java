package lde;

import java.util.Scanner;

public class Descarte {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		while (N != 0) {
			while(N < 1 || N > 50) {
				N = sc.nextInt();
			}
			
			Fila<Integer> filaN = new Fila<>();
			Fila<Integer> filaDescarte = new Fila<>();
			
			for (int k = 1; k <= N; k++) {
				filaN.enqueue(k);
			}
			
			while (filaN.size() > 1) {
				filaDescarte.enqueue(filaN.dequeue().value);
				filaN.fronToEnd();
			}
			
			System.out.println("Discarded cards: " + filaDescarte);
			System.out.println("Remaining card: " + filaN);
			
			N = sc.nextInt();
		}
		
		
		
		
		sc.close();

	}

}
