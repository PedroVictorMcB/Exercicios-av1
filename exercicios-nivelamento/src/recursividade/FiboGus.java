package recursividade;

import java.io.IOException;
import java.util.Scanner;

public class FiboGus {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int x = validarX(sc);
		sc.close();
		
//		if(x < 1) {
//			return;
//		}
		
		System.out.print(fibo(0, 1, x -1));
		System.out.println();
		
	}
	
	public static int validarX(Scanner sc) {
		int x = Integer.parseInt(sc.nextLine());
		if(x < 1 || x > 45) {
			System.out.println("Insira um valor maior que 1");
			return validarX(sc);
		} else {
			return x;
		}
	}
	
	public static String fibo(int a, int b, int count) {
		if(count == 0) {
			return Integer.toString(a);
		}
		return a + " " + fibo(b, a+b, count -1);
	}
}