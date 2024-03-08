package testeEstagio;

public class Exercicio1 {

	public static void main(String[] args) {
		
		int indice = 13;
		int soma = 0;
		int k = 0;
		
		for(int i = 0; k < indice; i++) {
			k = k + 1;
			soma = k + soma;
		}
		
		System.out.println("A soma será: " + soma);
		
		// O resultado será soma = 91
	}
}
