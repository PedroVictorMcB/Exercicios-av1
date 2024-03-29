package tadList;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class PokeList {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		List<String> pokemons = new LinkedList<String>();
		
		for(int i = 0; i < n; i++) {
			String newPokemon = sc.next();
			if(!pokemons.contains(newPokemon)) {
				System.out.println("added");
				pokemons.add(newPokemon);
			}
		}
		System.out.printf("Falta(m) %d pokemon(s).%n", (151 - pokemons.size()));
		sc.close();
	}
}