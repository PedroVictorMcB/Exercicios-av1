package nivelamento;

import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {
// problem 1151 beeCrowd - FIBONACCI FÁCIL

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		while ((N < 1) || (N > 45)) {
			N = sc.nextInt();
		}
		sc.close();
		int[] fibo = new int[45];
		fibo[0] = 0;
		fibo[1] = 1;

		for (int i = 2; i < fibo.length; i++) {
			fibo[i] = fibo[i - 2] + fibo[i - 1];
		}
		for (int i = 0; i < N; i++) {
			if (i < N-1) {
				System.out.print(fibo[i] + " ");
			} else {
				System.out.println(fibo[i]);
			}
		}
	}
}