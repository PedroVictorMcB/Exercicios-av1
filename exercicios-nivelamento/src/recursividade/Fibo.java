package recursividade;

import java.io.IOException;
import java.util.Scanner;

public class Fibo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long num = filtrarN(sc);
		
		printFibonacciSeries(0, num);
		
		sc.close();
	}
	
//	for recursivo abaixo
	 public static void printFibonacciSeries(int currentTerm, long num) {
	        if (currentTerm < num) {
	            System.out.print(fibo(currentTerm) + " ");
	            printFibonacciSeries(currentTerm + 1, num);
	        } else if (currentTerm == num) {
	            System.out.println(fibo(currentTerm));
	        }
	    }

//	 sequencia fibonacci abaixo
	public static long fibo(long num) {
		if (num < 0) {
			return 0;
		}
		if (num <= 1) {
			return num;
		} else {
			return fibo(num - 1) + fibo(num - 2);
		}
	}

//  while recursivo
	public static long filtrarN(Scanner sc) {
//      System.out.print("Digite um valor para N: ");
      long n = obterN(sc);
      if (validarN(n)) {
          return n;
      } else {
//          System.out.println("O valor de N deve ser maior que 0 e menor que 46.");
          return filtrarN(sc);
      }
  }

  public static long obterN(Scanner sc) {
      long n;
      try {
          n = Integer.parseInt(sc.nextLine());
      } catch (NumberFormatException e) {
//          System.out.println("Por favor, insira um valor inteiro válido.");
          return obterN(sc);
      }
      return n;
  }

  public static boolean validarN(long n) {
      return n > 0 && n < 46;
  }
}
