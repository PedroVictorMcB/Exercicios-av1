package nivelamento;

import java.io.IOException;
import java.util.Scanner;

public class StringInputOutput {

	public static void main(String[] args) throws IOException {
		// TODO Crie três variáveis para armazenar uma frase de no máximo 100 caracteres
		// Leia uma frase para cada variável
		// Após ler cada váriavel o programa deve imprimir a mesma logo em seguida e pular uma linha ao final 
		// da execução das 3 variáveis
		// Refaça a operação até ter a combinação de impressões: vary 1, vary 2, vary3, vary 2, vary 3, vary 1,
		// vary 3, var1, vary2
		// Repita o procedimento imprimindo 10 caracteres por vez
		
        Scanner sc = new Scanner(System.in);
        String[] frases = new String[3];
        for (int i = 0; i < frases.length; i++) {
            System.out.print("Escreva a frase " + (i + 1) + ": ");
        	frases[i] = sc.nextLine();
        }
        sc.close();

        System.out.println(frases[0] + frases[1] + frases[2]);
        System.out.println(frases[1] + frases[2] + frases[0]);
        System.out.println(frases[2] + frases[0] + frases[1]);

        System.out.println(frases[0].substring(0, Math.min(10, frases[0].length())) +
                           frases[1].substring(0, Math.min(10, frases[1].length())) +
                           frases[2].substring(0, Math.min(10, frases[2].length())));

	}

}