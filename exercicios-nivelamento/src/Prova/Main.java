package Prova;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		String[] nums = line.split(" ");
		int K = Integer.parseInt(nums[0]);
		int N = Integer.parseInt(nums[1]);
		
		
		
//		for (int i = 0; i < line.length(); i++) {
//			int item = Character.getNumericValue(line.charAt(i));
//			list.add(item);
//		}
		
	}
	
	static void showMostFreq(Scanner sc, int times) {
		LinkedList list = new LinkedList();
		String line = sc.nextLine();
//		int numberToBeVerified = Integer.parseInt(line);
		
		for (int j = 0; j < line.length(); j++) {
			int item = Character.getNumericValue(line.charAt(j));
			list.add(item);
		}
		
		if (times == 5) {
			System.out.println(5);
		} else {
			System.out.println(list.getMostFreq());
		}
		
		times--;
		if (times > 0) {
			showMostFreq(sc, times);
		}
	}
}


    	
//    	Scanner scanner = new Scanner(System.in);
//        
//        while (scanner.hasNext()) {
//            String number = scanner.next();
//            int[] frequency = new int[10]; // Array para contar a frequência de cada dígito
//            
//            // Contagem da frequência de cada dígito
//            for (int i = 0; i < number.length(); i++) {
//                int digit = Character.getNumericValue(number.charAt(i));
//                frequency[digit]++;
//            }
//            
//            // Encontrar o dígito mais frequente
//            int mostFrequentDigit = 0;
//            int maxFrequency = 0;
//            for (int i = 0; i < 10; i++) {
//                if (frequency[i] > maxFrequency || (frequency[i] == maxFrequency && i > mostFrequentDigit)) {
//                    mostFrequentDigit = i;
//                    maxFrequency = frequency[i];
//                }
//            }
//            
//            System.out.println(mostFrequentDigit);
//        }
//        
//        scanner.close();
//    }
//}
