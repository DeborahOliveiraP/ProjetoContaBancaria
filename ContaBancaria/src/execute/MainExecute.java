package execute;

import java.util.Scanner;

import domain.Conta;

public class MainExecute {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String ttl;
		int opcao;
		double valor;
		
		System.out.println("DIGITE TITULAR DA CONTA:");
		ttl = scn.nextLine();
		
		Conta c1 = new Conta(ttl);
		
		do {
			System.out.println("------ MENU ------");
			System.out.println("1) DADOS BANCARIO");
			System.out.println("2) DEPOSITO");
			System.out.println("3) SAQUE");
			System.out.println("0) SAIR");
			
			System.out.println("------------------");
			System.out.println("OPCAO: ");
			opcao = scn.nextInt();
			
			if(opcao == 1) {
				c1.DadosBancarios();
			}
			
			else if(opcao == 2) {
				System.out.println("Digite valor Deposito: ");
				valor = scn.nextDouble();
				
				c1.Depositar(valor);
			}
			else if(opcao == 3) {
				System.out.println("Digite valor de Saque: ");
				valor = scn.nextDouble();
				
				c1.Depositar(valor);
			}

		}while (opcao != 0 );

	}

}
