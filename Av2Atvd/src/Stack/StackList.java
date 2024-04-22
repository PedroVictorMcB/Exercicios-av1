package Stack;

import java.util.Scanner;

public class StackList<T> {
	Node<T> head;
	Node<T> tail;
	int length;
	
	public StackList(){
		head = null;
		tail = null;
		length = 0;
	}
	
	public void push(T value) {
		Node<T> data = new Node<>(value);
		if (this.head == null && this.tail == null) {
			this.head = data;
			this.tail = this.head;
		} else {
			Node<T> current = data;
			this.tail.next = current;
			this.tail = current;
			
		}
		this.length++;
	}
	
	public T top(){
		if (this.head == null) {
			return null;
		}
		
		return this.tail.value;
	}
	
	public T pop(){
		Node<T> popedElement = this.tail;
		Node<T> current = this.head;
		if (this.length == 1) {
			this.head = null;
			this.tail = null;
		} else {
			while (current.next != this.tail) {
				current = current.next;
			}
			current.next = null;
			this.tail = current;
		}
		
		this.length--;
		
		return popedElement.value;
	}
	
	public boolean isEmpty() {
		if (this.length == 0) {
			return true;
		}
		return false;
	}
	
	public int size() {
		return this.length;
	}
	
	public String toString() {
		String txtOutPut = (String) head.value.toString();
		
		Node<T> current = head.next;
		while (current != null) {
			txtOutPut += (String) current.value.toString();
			current = current.next;
		}
		return txtOutPut;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		StackList<String> express = new StackList<>();
		int N = 100;
		
		for (int counter = 0; counter < N; counter++) {
		
			String line = sc.nextLine();
			
			
			for (int i = 0; i < line.length(); i++) {
				String charComparison = String.valueOf(line.charAt(i));
				
				if (charComparison.equals("(")) {
					express.push(")");
				} else if (charComparison.equals(")") && express.isEmpty() == true) {
					express.push("(");
				} else if (charComparison.equals(")") && express.top().equals(")")) {
					express.pop();
				}
			}
			if (express.isEmpty() == true) {
				System.out.println("correct");
			} else if (express.isEmpty() == false) {
				System.out.println("incorrect");
			}
		}
		
		sc.close();
		
	}
}
