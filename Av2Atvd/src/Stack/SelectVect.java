package Stack;

import java.util.Locale;
import java.util.Scanner;

public class SelectVect {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		PilhaList<Double> vectNums = new PilhaList<>();
		
		System.out.println("Insira os valores a na pilha");
		for(int i = 0; i < 4; i++) {
			double value =  sc.nextDouble();
			vectNums.push(value);
		}
		sc.close();
		
		for(int i = 0; i < 4; i++) {
			if(vectNums.top() < 10) {
				System.out.println("A[" + i vectNums.pop());
			} else {
				vectNums.pop();
			}
		}
		
		
	}

}
