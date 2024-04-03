package Prova;

import java.util.Scanner;

//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//class LinkedList {
//    Node head;
//
//    LinkedList() {
//        head = null;
//    }
//
//    void add(int data) {
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
//    void display() {
//        Node current = head;
//        while (current != null) {
//            System.out.println(current.data);
//            if (current.next != null) {
//                System.out.print(" ");
//            }
//            current = current.next;
//        }
//    }
//}
////
//class FibonacciSeries {
//    LinkedList fibonacciList;
//
//    FibonacciSeries() {
//        fibonacciList = new LinkedList();
//        fibonacciList.add(0);
//        fibonacciList.add(1);
//    }
//
//    void generateSeries(int n) {
//        Node prev = null;
//        Node current = fibonacciList.head.next;
//        while (n > 2) {
//            int sum = (prev != null ? prev.data : 0) + current.data;
//            fibonacciList.add(sum);
//            prev = current;
//            current = current.next;
//            n--;
//        }
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        
//        while (n < 1 || n > 45) {
//        	n = scanner.nextInt();
//        }
//    	scanner.close();
//
//        FibonacciSeries fibonacciSeries = new FibonacciSeries();
//        fibonacciSeries.generateSeries(n);
//        fibonacciSeries.fibonacciList.display();
//    }
//}
