package Prova;

import java.util.Scanner;

//class Node {
//    int data;
//    Node next;
//
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    public LinkedList() {
//        this.head = null;
//    }
//
//    public void insert(int data) {
//        Node newNode = new Node(data);
//        if (head == null) {
//            head = newNode;
//        } else {
//            Node temp = head;
//            while (temp.next != null) {
//                temp = temp.next;
//            }
//            temp.next = newNode;
//        }
//    }
//
//    public int gcd() {
//        if (head == null) {
//            return 0;
//        }
//
//        int result = head.data;
//        Node current = head.next;
//        while (current != null) {
//            result = gcd(result, current.data);
//            current = current.next;
//        }
//        return result;
//    }
//
//    private int gcd(int a, int b) {
//        while (b != 0) {
//            int temp = b;
//            b = a % b;
//            a = temp;
//        }
//        return a;
//    }
//}
//
//public class Figure {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        int N = Integer.parseInt(scanner.nextLine()); // número de casos de teste
//
//        for (int i = 0; i < N; i++) {
//        	String line = scanner.nextLine();
//            String[] values = line.split(" ");
//            
//            if (values.length < 2) {
//                System.err.println("Entrada inválida: não há valores suficientes.");
//                continue; // Pula para a próxima iteração
//            }
//            
//            int F1 = Integer.parseInt(values[0]); // quantidade de figurinhas de Ricardo
//            int F2 = Integer.parseInt(values[1]); // quantidade de figurinhas de Vicente
//
//            LinkedList list = new LinkedList();
//            list.insert(F1);
//            list.insert(F2);
//
//            int maxGCD = list.gcd();
//            System.out.println(maxGCD);
//        }
//
//        scanner.close();
//    }
//}
