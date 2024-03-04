package nivelamento;

import java.io.IOException;
import java.util.Scanner;

public class FibonacciVetor {
	//1176 - FIBONACCI EM VETOR

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		long[] fibo = new long[61];
		int Test = 0;
		int indexTest = 0;
		
		System.out.print("Numero de testes: ");
		Test = sc.nextInt();
		
		while ((Test < 0) || (Test > 60)) {
			System.out.print("Digite um valor entre 0 e 60: ");
			Test = sc.nextInt();
		}
		
		fibo[0] = 0;
		fibo[1] = 1;
		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 2] + fibo[i - 1];
		}
		
		for (int i = 0; i < Test; i++) {
			System.out.print("Digite o indice a ser testado: ");
			indexTest = sc.nextInt();
			while ((indexTest < 0) || (indexTest > 60)) {
				System.out.print("Digite um valor entre 0 e 60: ");
				indexTest = sc.nextInt();
			}
			System.out.println("Fib(" + indexTest + ") = " + fibo[indexTest]);
		}
		
		sc.close();
	}
}
