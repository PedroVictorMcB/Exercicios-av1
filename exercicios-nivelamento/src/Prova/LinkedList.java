package Prova;

import java.util.Scanner;

public class LinkedList {
	Node head;
	Node tail;
	int length;
	
	LinkedList(){
		head = null;
		tail = null;
		length = 0;
	}
	
	void add(int value) {
		Node data = new Node(value);
		if (head == null && tail == null) {
			head = data;
			tail = head;
		} else {
			Node current = data;
			tail.next = current;
			tail = tail.next;
			
		}
		length++;
	}
	
	void addAt(int index, int value) {
		Node addItem = new Node(value);
		Node prev = this.get(index == -1? this.length-2: index -1);
		
		if (index == 0) {
			addItem.next = head;
			head = addItem;
		} else if (index == -1 || index == this.length -1) {
			this.tail.next = addItem;
			this.tail = addItem;
		} else {
			addItem.next = prev.next;
			prev.next = addItem;
		}
		this.length++;
	}
	
	void remove(int index) {
		if(index < this.length && index >= -1) {
			Node toRemove = this.get(index);
			Node prev = this.get(index == -1? this.length-2: index -1);
			
			if(index == 0) {
				head = head.next;
			} else if(index == -1 || index == this.length -1) {
				prev.next = null;
			} else {
				prev.next = toRemove.next;
			}
			this.length--;
		}
	}
	
	Node get(int index) {
		if (index == 0) {
			return head;
		} else if (index == -1 || index == this.length -1) {
			return tail;
		} else {
			Node current = head;
			int counter = 0;
			while(current.next != null) {
				if (index == counter) {
					return current;
				}
				counter++;
				current = current.next;
			}
		}
		throw new Error();
	}
	
	public boolean contains(int data) {
        Node current = head;
        while (current.next != null) {
            if(current.value == data) {
            	return true;
            }
            current = current.next;
        }
        return false;
	}
	
	public int getMostFreq() {
		Node current = head;
		int mostFreqDigt = 0;
		int mostFDCount = 0;
		
		while (current.next != null) {
			int actualCount = 0;
			for(int i = 0; i < this.length; i++) {
				Node listElement = this.get(i);
				
				if(current.value == listElement.value) {
					actualCount++;
					if (mostFDCount < actualCount) {
						mostFDCount = actualCount;
						mostFreqDigt = current.value;
					} else {
							if (mostFreqDigt < current.value && actualCount == mostFDCount) {
								mostFDCount = actualCount;
								mostFreqDigt = current.value;
						}
					}
				}
				
			}
			
			current = current.next;
			
        }
		return mostFreqDigt;
		
	}
	
	void setItem(int index, int value) {
		Node setNode = this.get(index);
		setNode.value = value;
	}
	
	void sort() {
		Node menor = head;
		
//		3421
		
		for(int i = 0; i < this.length; i++) {
			Node current = this.get(i);
			Node prev = this.get(i - 1);
			if(menor.value > current.value) {
				menor = current;
				menor.next = this.head;
				head = menor;
				prev.next = this.get(i);
				
				
//				current.next = menor;
//				menor = current;
//				this.remove(i);
			}
		}
		
		this.display();
	}
	
	void display() {
		StringBuilder strDisplay = new StringBuilder("[");
		Node current = head;
		while (current.next != null) {
			strDisplay.append(current.value + ", ");
			current = current.next;
		}
		strDisplay.append(current.value + "]" + " Length: " + this.length);
		
		System.out.println(strDisplay);
	}
	
	public static void main(String[]args) {
		LinkedList list = new LinkedList();
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		sc.close();
		
		for (int i = 0; i < line.length(); i++) {
			int item = Character.getNumericValue(line.charAt(i));
			list.add(item);
		}
		
		list.display();
		
		list.sort();
		
//		System.out.println(list.getMostFreq());
		
	}
}