package recursividade;

import java.io.IOException;
import java.util.Scanner;

public class Figure1 {

public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		N = Integer.parseInt(sc.nextLine());
		
		enquantoHouverPrint(N, sc);
		
		sc.close();
	}
	
//	public static int validarN(Scanner sc) {
//		int N = Integer.parseInt(sc.nextLine());
//		
//		if(N <= 0 || N > 3000) {
//			return validarN(sc);
//		} else {
//			return N;
//		}
//	}
	
//	public static int validarFig(Scanner sc) {
//		int N = sc.nextInt();
//		if(N <= 0 || N > 1000) {
//			System.out.println("Insira um valor entre 1 e 1000");
//			return validarFig(sc);
//		} else {
//			return N;
//		}
//	}
	
	public static int mdc(int fig1, int fig2) {
        if (fig2 == 0) {
            return fig1;
        } else {
            return mdc(fig2, fig1 % fig2);
        }
    }
	
	public static void enquantoHouverPrint(int N, Scanner sc) {
		int i = 0;
		
		paraNossaAlegria(N, i, sc);
	}
	
	public static int paraNossaAlegria(int N, int i, Scanner sc) {
		if(i < N) {
			int Ric = Integer.parseInt(sc.nextLine());
			int Vic = Integer.parseInt(sc.nextLine());
//			int Ric = validarFig(sc);
//			int Vic = validarFig(sc);
			int mdc = mdc(Ric, Vic);
			System.out.printf("%d\n",mdc);
			i++;
			return paraNossaAlegria(N, i, sc);
		} else {
			return 1;
		}
	}
}
