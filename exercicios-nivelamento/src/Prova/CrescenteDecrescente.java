package Prova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// USANDO RECURSIVIDADE

public class CrescenteDecrescente {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
	rec(sc, list);
	
	for(int i: list) {
		System.out.println(i);
	}
	sc.close();
	
	}
	static void rec(Scanner sc, List<Integer> list) {
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		if(num1 < num2) {
            list.add(num1);
			list.add(num2);
			System.out.println("Crescente");
		}
		else if (num1 == num2) {
			list.add(num1);
			list.add(num2);
			return;
		}
		else {
			list.add(num2);
			list.add(num1);
			System.out.println("Decrescente");
		}
		rec(sc,list);	
		}
}
