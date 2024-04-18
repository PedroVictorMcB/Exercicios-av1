package exerceicioStackList;

import java.util.Scanner;

import Stack.StackList;

public class Trem {

	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		validation(sc, 0);
	
	}
	
	static void tremBao(int vagoesQtd, String[] vagoesOrder) {
		StackList<Integer> entrance = new StackList<>();
		StackList<Integer> station = new StackList<>();
		StackList<Integer> exit = new StackList<>();
		StackList<Integer> testCase = new StackList<>();
		
		for (int i = vagoesOrder.length -1; i >= 0; i--) {
			int element = Integer.parseInt(vagoesOrder[i]);
			testCase.push(element);
		}
		
		for (int i = vagoesQtd; i > 0; i--) {
			entrance.push(i);
		}
		
		while (entrance.size() != 0) {
			station.push(entrance.pop());
			if (testCase.top() == station.top()) {
				while ((station.top() == testCase.top()) && (testCase.top() != null)) {
					exit.push(station.pop());
					if(testCase != null) {
						testCase.pop();
					}
				}
			}
		}
		
		if (station.isEmpty() == true) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
	
	public static void validation(Scanner sc, int vagoesCount) {
		
		int requestNumber = vagoesCount;
		
		if (vagoesCount == 0) {
			System.out.println("insira qtd de vagoes: ");
			requestNumber = sc.nextInt();
		}
		
		String[] requestOrderArr = {};
		sc.nextLine();
		
		while((requestNumber > 0) && (requestNumber <= 1000)) {
			do {
				
				System.out.println("insira ordem dos vagoes: ");
				String requestOrder = sc.nextLine();
				requestOrderArr = requestOrder.split(" ");
			
				if (requestOrderArr[0].equals("0")) {
					break;
				}
			
				while (requestOrderArr.length != requestNumber) {
				requestOrder = sc.nextLine();
				requestOrderArr = requestOrder.split(" ");
				}
			
				tremBao(requestNumber, requestOrderArr);
			
			}	while ((requestOrderArr[0] != "0"));
			
			if(requestOrderArr[0].equals("0")) {
				System.out.println("insira qtd de vagoes: ");
				requestNumber = sc.nextInt();
				if (requestNumber == 0) {
					return;
				}
				validation(sc, requestNumber);
			}
		}
		
		
		
	}
}


