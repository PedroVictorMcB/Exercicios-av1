package tadList;

import java.util.Scanner;

public class ListTreino {

	private int size;
	private Object[] list;
	private int i;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int CompetitorTest = sc.nextInt();
		
		while(CompetitorTest <= 1 || CompetitorTest >= 1000) {
			System.out.println("valor entre 2 e 999");
			CompetitorTest = sc.nextInt();
		}
		sc.nextLine();
		
		ListTreino competitors = new ListTreino(CompetitorTest);
		
		//PRECISO FAZER A LEITURA HORIZONTAL DOS VALORES DE UM VETOR DE TAMANHO N
		for(int i = 0; i < competitors.sizeOf(); i++) {
			System.out.print("digite 1 para confirmados e 0 para não confirmados: ");
			String line = sc.nextLine();
			String[] nums = line.split(" ");
			int oneZero = Integer.parseInt(nums[i]);
			competitors.addItem(oneZero);
//			int comp = sc.nextInt();
			
		}
		
		int cont = 0;
		Object num = 1;
		for(int i = 0; i < competitors.sizeOf(); i++) {
			if(competitors.getIndex(i) == num) {
				cont = cont + 1;
			}
		}
		
		System.out.println(cont);
		
		for(int i = 0; i < competitors.sizeOf(); i++) {
			System.out.println(competitors.getIndex(i));
		}
		
		sc.close();
	}
	
	public ListTreino(int size) {
		if(size > 0) {
			this.size = size;
		} else {
			this.size = 1;
		}
		list = new Object[this.size];
		this.i = 0;
	}
	
	public void addItem(Object item) {
		if(this.i < this.size) {
			list[this.i] = item;
			this.i++;
		} else {
			System.out.println("Lista cheia");
		}
	}

	public int sizeOf() {
		return this.size;
	}
	
	public Object getIndex(int index) {
		if(index < 0 || index >= this.size) {
			System.out.println("out of boundrys");
		} 
		
		return list[index];
	}
}