package nivelamento;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SelecaoVetor {
// 1174 - SELECAO VETOR 1
	
	public static void main(String[] args) throws IOException {
	
//		NO JAVA A ORDEM QUE OS OBJETOS SÃO INICIADOS É IMPORTANTE.
//		SE VOCÊ INICIAR O LOCALE DEPOIS DO SCANNER ELE NÃO VAI FUNCIONAR.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double[] vetA = new double[100];
		
		for (int i = 0; i < vetA.length; i++) {
			vetA[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vetA.length; i++) {
			if (vetA[i] <= 10) {
				System.out.println("A[" + i + "] = " + vetA[i]);
			}
		}
		sc.close();
	}

}