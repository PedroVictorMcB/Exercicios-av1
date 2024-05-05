package lde;

import java.util.Scanner;

public class NewFollowers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
//		while(N <1 || N > Math.pow(10, 9)) {
//			N = sc.nextInt();
//		}
		
		int M = sc.nextInt();
//		while(M <= N || M > Math.pow(10, 9)) {
//			M = sc.nextInt();
//		}
		
		Fila<Integer> followNums = new Fila<>();
		int soma = 0;
		for(int i = 0; i < 30; i++) {
			int followers = 0;
			followers = sc.nextInt();
			
//			while(followers < 1 || followers > Math.pow(10, 5)) {
//				followers = sc.nextInt();
//			}
			followNums.enqueue(followers);
			soma += followers;
		}
		
		sc.close();
		
		int days = 0;
		while(N < M) {
			int dailyFollowers = media(soma);
			
			followNums.enqueue(dailyFollowers);
			soma += dailyFollowers;
			int followMinus = followNums.dequeue().value;
			soma = soma - followMinus;
			
			N += dailyFollowers;
			
			days++;
		}
		
		System.out.println(days);
	}
	
	public static int media(int soma) {
//		Fila<Integer> auxList = new Fila<>();
//		int followSoma = 0;
//		while(!list.isEmpty()) {
//			auxList.enqueue(list.dequeue().value);
//			followSoma += auxList.front().value;
//		}
//		
//		while(!auxList.isEmpty()) {
//			list.enqueue(auxList.dequeue().value);
//		}
		int followMedia = (int) Math.ceil(soma/30.0);
		
		return followMedia;
	}
}
