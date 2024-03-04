package nivelamento;

import java.io.IOException;
import java.util.Scanner;

public class FatorialSimples {
// 1153 - fatorial SIMPLES
	
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		int N;
		int fat;
		
		N = sc.nextInt();
		
		while ((N < 1) || (N > 12)) {
			N = sc.nextInt();
		}
		sc.close();
		
		fat = N;
		for (int i = 1; i < N; i++) {
			fat = fat * (N - i);
		}
		System.out.println(fat);
	}

}
