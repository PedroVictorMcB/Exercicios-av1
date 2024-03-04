package nivelamento;

import java.io.IOException;
import java.util.Scanner;

public class SenhaFixa {

	//Faça um programa que receba números de entrada até encontrar o número correto da senha. Só então o loop termina.
	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		int senha = 2002;
		System.out.print("Digite a senha: ");
		int codeBraker = sc.nextInt();
		
		while (senha != codeBraker ) {
			System.out.println("Senha Invalida");
			System.out.print("Digite a senha correta: ");
			codeBraker = sc.nextInt();
		}
		
		sc.close();
		
		System.out.println("Acesso Permitido");
	}

}
