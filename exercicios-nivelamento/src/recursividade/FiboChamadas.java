package recursividade;

import java.util.Scanner;

public class FiboChamadas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] casos = new int[N];
		for(int i = 0; i < N; i++) {
			casos[i] = sc.nextInt();
		}
		
		for(int caso: casos) {
			int[] resultado = calcularFibo(caso);
			System.out.println("fib(" + caso + ") = " + resultado[1] + " calls = " + resultado[0]);
		}
		
		sc.close();
	}
		
		public static int[] calcularFibo(int n) {
			if(n == 0) {
				return new int[] {0, 0};
			} else if(n == 1) {
				return new int[] {1, 0};
			} else {
				int[] fibo1 = calcularFibo(n-1);
				int[] fibo2 = calcularFibo(n-2);
				return new int[] {fibo1[0] + fibo2[0], fibo1[1] + fibo2[1] + 2};
			}
		
		}
		
		// TRABALHAR ESTA QUESTÃO COM O EDUARDO
		// FIBONACCI QUANTAS CHAMADAS
		public static int[] forCase(int i, int N, Scanner sc, int[] casos) {
			if(i < N) {
				casos[i] = sc.nextInt();
				i++;
			}
			return casos;
		}
}