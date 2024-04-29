package conta_banco;

import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {

	public static void main(String[] args) {		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Por favor, preencha os campos abaixo!");
		
		System.out.print("Número da Agência: ");
		String agencia = sc.nextLine();
		
		System.out.print("Conta e digito: ");
		int numero = sc.nextInt();
		
		sc.nextLine();
		
		System.out.print("Nome Cliente: ");
		String nome = sc.nextLine();
		
		System.out.print("Saldo: ");
		double saldo = sc.nextDouble();
				
		System.out.println();
		
		System.out.println("Olá "+ nome +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", conta " + numero + " e seu saldo R$"+ String.format("%.2f", saldo) +" já está disponível para saque.");
		
		sc.close();

	}
}
