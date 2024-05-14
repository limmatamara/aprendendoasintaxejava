package contaBanco;

import java.util.Locale;
import java.util.Scanner;

public class Usuario {

	public static void main(String[] args) {
		ContaBanco contaBanco = new ContaBanco();
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.ENGLISH);
		System.out.println("Por favor, digite o nome do cliente: ");
		contaBanco.nomeCliente = sc.next();
		System.out.println("Por favor, digite o número da agência: ");
		contaBanco.agencia = sc.next();
		System.out.println("Por favor, digite o número da conta:");
		contaBanco.numero = sc.nextInt();
		System.out.println("Por favor, digite o valor do saldo:");
		contaBanco.saldo = sc.nextDouble();
		
		System.out.println("Olá " + contaBanco.nomeCliente +
						   ", obrigado por criar uma conta em nosso banco, sua agência é "
							+ contaBanco.agencia + ", conta " + contaBanco.numero
							+ " e seu saldo R$ " + contaBanco.saldo + " já está disponível para saque.");
	}

}
