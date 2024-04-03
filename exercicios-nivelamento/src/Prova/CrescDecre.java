//package Prova;
//
//import java.util.Scanner;
//
//public class CrescDecre {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Insira dois valores:");
//		String line = sc.nextLine();
//		String[] numListStr = line.split(" ");
//		int data1 = Integer.parseInt(numListStr[0]);
//		int data2 = Integer.parseInt(numListStr[1]);
//
//		while(data1 != data2) {
//			if(data1 < data2) {
//				System.out.println("Crescente");
//			} else if(data1 > data2) {
//				System.out.println("Decrescente");
//			}
//			
//			line = sc.nextLine();
//			numListStr = line.split(" ");
//			data1 = Integer.parseInt(numListStr[0]);
//			data2 = Integer.parseInt(numListStr[1]);
//			
//		}
//		sc.close();
//
//	}
//	
//	class Node {
//		int value;
//		Node next;
//		
//		Node(int value){
//			this.value = value;
//			next = null;
//		}
//	}
//	
//	class ChainList {
//		Node head;
//		
//		ChainList(){
//			head = null;
//		}
//		
//		void add(int value) {
//			Node data = new Node(value);
//			if (head == null) {
//				head = data;
//			} else {
//				Node current = head;
//				while(current.next != null) {
//					current = current.next;
//				}
//				current.next = data;
//			}
//		}
//	}
//
//}
