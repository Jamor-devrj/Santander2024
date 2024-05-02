package fluxo_de_repeticao;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom; //gera valor aleatorio

public class ExemploWhile {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);;
		
		double mesada = 50.0;
		int x = 1;
		
		while(mesada > 0) {
			Double valorDoce = valorAleatorio();
			if(valorDoce > mesada)
				valorDoce = mesada;			
			
			System.out.println((x++) + " - Doce do valor: R$ "+ String.format("%.2f", valorDoce) + " adcionado no carrinho");
			mesada -= valorDoce;
			 
		}
		
		System.out.println("Mesada: R$ "+ String.format("%.2f", mesada));
		System.out.println("Joãozinho gastou toda a sua mesada em doces");
		
	}
	private static double valorAleatorio() {
		return ThreadLocalRandom.current().nextDouble(2, 10);
	}
}
