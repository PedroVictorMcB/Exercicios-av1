package lde;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		LinkedDouble<Integer> fila = new LinkedDouble<Integer>();
//		LinkedDouble<Integer> filaRemove = new LinkedDouble<Integer>();
//		
//		int N = sc.nextInt();
//		
//		while (N <1 || N >50000) {
//			N = sc.nextInt();
//		}
//		
//		for(int i = 0; i < N; i++) {
//			fila.enqueue(sc.nextInt());
//		}
//		
//		int M = sc.nextInt();
//		
//		while (M < 1 || (M >= N)) {
//			M = sc.nextInt();
//		}
//		
//		for (int i = 0; i < M; i++) {
//			filaRemove.enqueue(sc.nextInt());
//		}
//		
//		Node<Integer> enderList = fila.tail;
//		int shiftCounter = 0;
//		
//		while (!filaRemove.isEmpty()) {
//			if (filaRemove.front().value == fila.front().value) {
//				filaRemove.dequeue();
//				fila.dequeue();
//			} else {
//				Node<Integer> toShift = fila.dequeue();
//				fila.enqueue(toShift.value);
//				shiftCounter++;
//			}
//			if (fila.front()== enderList) {
//				filaRemove.dequeue();
//				enderList = fila.tail;
//			}
//		}
//		int shiftLefts = fila.size() - shiftCounter;
//		
//		if (shiftLefts >= 1) {
//			while(shiftLefts != 0) {
//				Node<Integer> toShift = fila.dequeue();
//				fila.enqueue(toShift.value);
//				shiftLefts--;
//			}
//		}
//		
//		System.out.println(fila);
		
		
		
		Dequeue<Integer> list = new Dequeue<>();
		
		for(int i = 0; i < 4; i++) {
			list.addLast(i);
		}
		System.out.println(list);
		
		for(int i = 0; i < 2; i++) {
			list.firsToLast();
		}
		System.out.println(list);
		
		for(int i = 0; i < 2; i++) {
			list.lasToFirst();
		}
		System.out.println(list);
		
	}
}
