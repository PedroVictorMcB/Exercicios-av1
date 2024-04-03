package Prova;

import java.util.Scanner;

////Classe para representar um nó da lista encadeada
//class Node {
//int data;
//Node next;
//
//public Node(int data) {
//   this.data = data;
//   this.next = null;
//}
//}
//
////Classe para representar a lista encadeada
//class LinkedList {
//Node head;
//
//public LinkedList() {
//   this.head = null;
//}
//
//// Método para inserir um elemento no início da lista
//public void insert(int data) {
//   Node newNode = new Node(data);
//   newNode.next = head;
//   head = newNode;
//}
//
//// Método para calcular o fatorial
//public int calculateFactorial() {
//   int factorial = 1;
//   Node current = head;
//   while (current != null) {
//       factorial *= current.data;
//       current = current.next;
//   }
//   return factorial;
//}
//}
//
////Classe principal Main
//public class Main {
//public static void main(String[] args) {
//   Scanner scanner = new Scanner(System.in);
//   int N = scanner.nextInt();
//   
//   while (N <= 0 || N >= 13) {
//       scanner.nextInt();
//   }
//   scanner.close();
//
//   // Criando a lista encadeada e inserindo os números de 1 a N
//   LinkedList list = new LinkedList();
//   for (int i = 1; i <= N; i++) {
//       list.insert(i);
//   }
//
//   // Calculando o fatorial
//   int factorial = list.calculateFactorial();
//
//   // Exibindo o resultado
//   System.out.println(factorial);
//}
//}
