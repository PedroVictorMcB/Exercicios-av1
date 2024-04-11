package Prova;

import java.util.ArrayList;
import java.util.Scanner;

public class Quest1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> listNum = new ArrayList<>();
		parImpar(listNum, N);
		
		sc.close();

	}
	
	static void parImpar(ArrayList<Integer> list,int N) {
      if (N % 2 != 0) {
    	  list.add(N);
    	  System.out.println(N);
      } else if (N == 0) {
    	  return;
      }
      N--;
      parImpar(list, N);
  }

}
