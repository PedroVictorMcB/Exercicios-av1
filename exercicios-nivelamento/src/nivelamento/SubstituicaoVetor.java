package nivelamento;

import java.io.IOException;
import java.util.Scanner;

public class SubstituicaoVetor {
// 1172 - SUBSTITUICAO DE VETOR 1
	
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int [] vetX = new int[10];
		int num = 1;
		
		for (int i = 0; i < 10; i++) {
			vetX[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < 10; i++) {
			if (vetX[i] <= 0) {
				vetX[i] = num;
			}
			System.out.println("X[" + i + "] = " + vetX[i]);
		}
	}

}