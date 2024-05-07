package lde;

import java.util.Scanner;

public class FilaRecreio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira o numero de testes");
		int caseTestes = sc.nextInt();
		while(caseTestes < 1 || caseTestes > 93) {
			caseTestes = sc.nextInt();
		}
		
		for(int h = 0; h < caseTestes; h++) {
			System.out.println("Insira o numero de alunos");
			int numberAlunos = sc.nextInt();
			while(numberAlunos < 1 || numberAlunos > 1000) {
				numberAlunos = sc.nextInt();
			}
			
			Fila<Integer> filaChegada = new Fila<>();
			System.out.println("Insira a nota dos " + numberAlunos + "alunos:");
			for(int i = 0; i < numberAlunos; i++) {
				int notas = sc.nextInt();
				filaChegada.enqueue(notas);
			}
			
			Fila<Integer> filaDecres = filaChegada.sortDecresInt();
			
			int alunosNotTroca = 0;
			for(int i = 0; i < filaChegada.size(); i++) {
				if(filaChegada.front().value == filaDecres.front().value) {
					alunosNotTroca += 1;
					filaChegada.fronToEnd();
					filaDecres.fronToEnd();
				} else {
					filaChegada.fronToEnd();
					filaDecres.fronToEnd();
				}
			}
			
			System.out.println("numero de alunos que não trocaram de lugar: " + alunosNotTroca);
		}
		
		sc.close();
	}

}
