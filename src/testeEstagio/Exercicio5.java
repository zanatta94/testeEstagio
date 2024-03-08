package testeEstagio;

import java.util.ArrayList;
import java.util.List;

public class Exercicio5 {

	public static void main(String[] args) {
		
		String palavra = "FELIPE";
		String palavraReverse = "";
		List vet = new ArrayList<>();
				
		for(int i = palavra.length() -1; i >= 0; i--) {
			char c = palavra.charAt(i);
			vet.add(c);
		}
		
		for(int i = 0; i < palavra.length(); i++) {
			palavraReverse += vet.get(i).toString();
		}
		
		System.out.println(palavraReverse);

	}
}
