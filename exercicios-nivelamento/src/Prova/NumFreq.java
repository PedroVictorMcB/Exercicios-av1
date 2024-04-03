package Prova;

import java.util.Scanner;

public class NumFreq {
	  public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  String numStr = sc.nextLine();
		  int[] numList = new int[10];
		  
		  int cont = 0;
		  for(int i = 0; i < numStr.length(); i++) {
			  char txtIndex = numStr.charAt(i);
			  
			  for(int j = 0; j < numStr.length(); j++) {
				  if(txtIndex == numStr.charAt(j)) {
					  cont++;
				  }
			  }
			  numList[i] = cont;
			  cont = 0;
		  }
		  
		  for(int i = 0; i < numList.length; i++) {
			  System.out.println("Num: " + numStr.charAt(i) + " = " + numList[i] + " vezes");
		  }
		  
		  sc.close();
		  
//	    String myStr = "0100011199";
//	    char result = myStr.charAt(9);
//	    int cont = 0;
//	    for (int i = 0; i < 10; i++) {
//	    	if (result == myStr.charAt(i)){
//	        	cont++;
//	        }
//	    }
//	    
//	    System.out.println(cont);
	  }

	}
