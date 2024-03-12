package recursividade;

import java.io.IOException;
import java.util.Scanner;

public class FatorialSimples {

	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = filtrarN(sc);
        System.out.println(fatorial(num));
		
	}
	
//	while recursivo
	public static int filtrarN(Scanner sc) {
//        System.out.print("Digite um valor para N: ");
        int n = obterN(sc);
        if (validarN(n)) {
            return n;
        } else {
//            System.out.println("O valor de N deve ser maior que 0 e menor que 13.");
            return filtrarN(sc);
        }
    }

    public static int obterN(Scanner sc) {
        int n;
        try {
            n = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
//            System.out.println("Por favor, insira um valor inteiro válido.");
            return obterN(sc);
        }
        return n;
    }

    public static boolean validarN(int n) {
        return n > 0 && n < 13;
    }
    
//    fatorial recursivo
    public static int fatorial(int n) {
    	if (n == 1) {
    		return 1;
    	} else {
    		return n * fatorial(n - 1);
    	}
    }
}