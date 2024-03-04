package nivelamento;

import java.io.IOException;
import java.util.Scanner;

public class TrocaVetor {
// 1175 - TORCA EM VETOR 1
	
	public static void main(String[] args) throws IOException {
	
		Scanner sc = new Scanner(System.in);
		
		int[] vetN = new int[20];
		int aux = 0;
		
		for (int i = 0; i < vetN.length; i++) {
			vetN[i] = sc.nextInt();
		}
		sc.close();
		
		for (int i = 0; i < (vetN.length / 2); i++) {
			aux = vetN[i];
			vetN[i] = vetN[vetN.length - i - 1];
			vetN[vetN.length - i - 1] = aux;
		}
		
		for (int i = 0; i < vetN.length; i++) {
			System.out.println("N[" + i + "] = " + vetN[i]);
		}
		
	}
}