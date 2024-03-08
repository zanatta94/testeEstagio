package testeEstagio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int valorElemento = 0;
		
		ArrayList<Integer> fibonacci = new ArrayList<>();
		fibonacci.add(0);
		fibonacci.add(1);
		
		
		try {			
			System.out.println("Insira o número desejado: ");
			int numero = sc.nextInt();
			
			for(int i = 0; valorElemento >= 0; i++) {
				
				valorElemento = fibonacci.get(i) + fibonacci.get(i + 1);
				fibonacci.add(valorElemento);
				
				if(valorElemento == numero) {
					System.out.println("O número " + numero +" pertence a sequência Fibonacci, e o próximo elemento da sequência é: " + (valorElemento + fibonacci.get(i + 1)));
					break;
				}
				
				if(valorElemento > numero) {
					System.out.println("Este número não está na sequência Fibonacci");
					break;
				}
			}
			
			sc.close();
		}
		catch (InputMismatchException e) {
			sc.close();
			System.out.println("O valor inserido deve ser um númeor INTEIRO! Execute o programa de novo.");
		}

	}

}
