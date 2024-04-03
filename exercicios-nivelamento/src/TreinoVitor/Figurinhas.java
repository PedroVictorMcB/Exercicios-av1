package TreinoVitor;

import java.util.Scanner;

public class Figurinhas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		while(!(N>=1 && N<=3000)) {
			System.out.println("Entre 1 e 3000");
			N = sc.nextInt();
		}
		
		int resto = 0;
		int mdc = 0;
		int maior = 0;
		int menor = 0;
		int ric = 0;
		int vic = 0;
		
		for (int i = 0; i < N; i++) {
			ric = sc.nextInt();
			while(ric < 1 || ric > 1000) {
				System.out.println("Entre 1 e 1000");
				ric = sc.nextInt();
			}
			
			vic = sc.nextInt();
			
			while(vic < 1 || vic > 1000) {
				System.out.println("Entre 1 e 1000");
				vic = sc.nextInt();
			}
			
			if(ric > vic) {
				maior = ric;
				menor = vic;
			} else {
				maior = vic;
				menor = ric;
			}
			
			while(menor != 0) {
				resto = maior % menor;
				maior = menor;
				menor = resto;
			}
			mdc = maior;
			System.out.println(mdc);
		}
		
		sc.close();
	}

}
