package lde;

public class MainTester {

	public static void main(String[] args) {
		PilhaBasedFila<Integer> PBF = new PilhaBasedFila<>();
		
		for(int i=1; i <= 4; i++) {
			PBF.push(i);
		}
		
		System.out.println(PBF);
		System.out.println(PBF.isEmpty());
		System.out.println(PBF.size());
		System.out.println(PBF.top());
		System.out.println(PBF.pop());
		System.out.println(PBF);

	}

}
