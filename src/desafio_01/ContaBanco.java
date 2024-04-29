package desafio_01;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero;
				
		System.out.println("Digite um numero");			
		numero = sc.nextInt();
		
		System.out.println("Seu numero é " + numero);
		
		sc.close();

	}

}
