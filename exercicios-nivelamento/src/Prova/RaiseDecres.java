package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class RaiseDecres {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> listNum = new ArrayList<>();
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(parImpar(N));
		
//		orderedRec(sc, listNum);
//		
//		for (int i: listNum) {
//			System.out.println(i);
//		}
//		
//		sc.close();
		
	}
	
	static void orderedRec(Scanner sc, ArrayList<Integer> list) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if (num1 == num2) {
			return;
		} else if(num1 < num2) {
			list.add(num1);
			list.add(num2);
			System.out.println("Crescente");
		} else {
			list.add(num1);
			list.add(num2);
			System.out.println("Decrescente");
		}
		orderedRec(sc, list);
	}
	
	static int parImpar(int N) {
		
		
		
		
		while (N != 0) {
			if (N % 2 != 0) {
				System.out.println(N);
			}
			N--;	
		}
		return parImpar(N);
	}
}
