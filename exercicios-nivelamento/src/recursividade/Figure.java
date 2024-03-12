package recursividade;

import java.io.IOException;
import java.util.Scanner;

public class Figure {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int N = 0;
		
		N = validarN(sc);
		if (N == 0) {
			return;
		}
		enquantoHouverPrint(N, sc);
		
		sc.close();
	}
	
	public static int validarN(Scanner sc) {
		int N;
		try {
			N = sc.nextInt();
		} catch (NumberFormatException e) {
			return validarN(sc);
		} finally {
			
		}
		
		if(N <= 0 || N > 10) {
			return validarN(sc);
		} else {
			return N;
		}
	}
	
	public static int validarFig(Scanner sc) {
		int num1, num2;
		try {
			String line = sc.nextLine();
			String[] nums = line.split(" ");
			num1 = Integer.parseInt(nums[0]);
			num2 = Integer.parseInt(nums[1]);
			if(num1 <= 0 || num1 > 1000 || num2 <= 0 || num2 > 1000) {
//				System.out.println("Insira um valor entre 1 e 1000");
				return validarFig(sc);
			} else {
				return nums;
			}
		} catch (Exception e) {
			return validarFig(sc);
		} finally {
			
		}
//		int N = sc.nextInt();
		
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
	
	public static void enquantoHouverPrint(int N, Scanner sc) {
		int i = 0;
		
		paraNossaAlegria(N, i, sc);
	}
	
	
	//estrutura PARA
	public static int paraNossaAlegria(int N, int i, Scanner sc) {
		if(i < N) {
			int Ric = validarFig(sc);
			int Vic = validarFig(sc);
			int mdc = mdc(Ric, Vic);
			System.out.printf("%d\n",mdc);
			i++;
			return paraNossaAlegria(N, i, sc);
		} else {
			return 1;
		}
	}
}
