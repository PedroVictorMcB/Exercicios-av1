package Stack;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		
		//Neste código receba uma expressão matemática infixa e transforme-a em posfixa.
		//exemplo (2+3)*5 = 23+5*
		
		//1º solução:
		// crie pilhas para: ordem dos parenteses, operações, operadores, expressãoFinal
		// crie uma variável para receber a expressão
		// crie uma variável do tipo char para percorrer a expressão.
		//verifique se o caracter isLetterOrDigit(),
		  //verifique se o caracter isNumeric(),
		    //se true:
		      //operações.push(caracter);
		  //verifique se o caracter isLetter(),
		    //se true:
		      //operações.push(caracter);
		  //else
		    //operadores.push(caracter);
		//verifique se o caracter equals("("),
		  //se true: 
		    //ordemParenteses.push(caracter);
		    //ordemParenteses.push(")");
		//verifique se o caracter equals(")"),
		  //se true:
		    //se ordemParenteses.top() equals(caracter);
		      //while ordemParenteses.top() != null {ordemParenteses.pop()};
		      //operações.inverse();
		      //while (operações.top() != null){expressãoFinal.push(operações.pop())}
		      //se (operadores.top() != null){expressãoFinal.push(operadores.pop())}
		    //else if (ordemParenteses.top() == null){return sysout("Invalid Expression!")
		//while (operações.top() != null){expressãoFinal.push(operações.pop())};
		//while (operadores.top() != null) {expressãoFinal.push(operadores.pop())};
		//expressãoFinal.inverse();
		//imprima o expressãoFinal;
		      
		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		
//		//o valor que o beecrowd passa é 1005
//		while (N<1 || N>= 1006) {
//		    N = sc.nextInt();
//		}
//		sc.nextLine();
		
		StackList<Integer> listInverse = new StackList<>();
		
		for (int i = 4; i >= 0; i--) {
			listInverse.push(i);
		}
		System.out.println(listInverse);
		
		listInverse.inverse(listInverse);
		System.out.println(listInverse);
		
	}

}
