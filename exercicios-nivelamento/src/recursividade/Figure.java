package recursividade;

import java.util.Scanner;

public class Figure {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int Ric = 0;
		int Vic = 0;
		int mdc = 0;
		
		N = validarN(sc);
		Ric = validarFig(sc);
		Vic = validarFig(sc);
		
		mdc = mdc(Ric, Vic);
		
		System.out.println(mdc);
		
		sc.close();
	}
	
	public static int validarN(Scanner sc) {
		int N = Integer.parseInt(sc.nextLine());
		if(N <= 0 || N > 3000) {
			System.out.println("Insira um inteiro entre 1 e 3000");
			return validarN(sc);
		} else {
			return N;
		}
	}
	
	public static int validarFig(Scanner sc) {
		int N = Integer.parseInt(sc.nextLine());
		if(N <= 0 || N > 1000) {
			System.out.println("Insira um valor entre 1 e 1000");
			return validarFig(sc);
		} else {
			return N;
		}
	}
	
//	public static int mdc(int fig1, int fig2) {
//		int mdc = 1;
//		int division = 2;
//		if((fig1 % division == 0) && (fig2 % division == 0)) {
//			mdc *= division;
//			return mdc(fig1, fig2);
//		} else if ((fig1 % division == 0) || (fig2 % division == 0)) {
//			return mdc(fig1, fig2);
//		} else if ((fig1 % division != 0) && (fig2 % division != 0)) {
//			division += 1;
//			return mdc(fig1, fig2);
//		} else {
//			return mdc;
//		}
//	}
	
	public static int mdc(int fig1, int fig2) {
        if (fig2 == 0) {
            return fig1;
        } else {
            return mdc(fig2, fig1 % fig2);
        }
    }
	
	public static String enquantoHouverPrint(int N, int mdc) {
		int num = N;
		if(N >= 0) {
			
		}
	}

}
