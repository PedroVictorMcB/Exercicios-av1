package exerciciosSala;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		String name;
		
		System.out.println("Parker, make a list of some girlfriends you had!");
		System.out.print("Take a number: ");
		N = sc.nextInt();
		sc.nextLine();  //limpeza do buffer
		
		AvengersList teamA = new AvengersList(N);
		
		for (int i = 0; i < teamA.sizeOf(); i++) {
			System.out.print("Girlfriend " + (i+1) + ": ");
			name = sc.nextLine();
			teamA.parkersGFS(name);
		}
		
		for(int i = 0; i< teamA.sizeOf(); i++) {
			System.out.println(teamA.hawkEye(i));
		}
		
		sc.close();
		
		System.out.printf("Tamanho da Lista: %d", teamA.sizeOf());
	}

}
