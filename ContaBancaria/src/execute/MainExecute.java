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
			
			System.out.println("Cadastro de pessoa de uma clinica\n"
					+ "1) DADOS BANCARIO\n"
					+ "2) DEPOSITO\n"
					+ "3) SAQUE\n"
					+ "0) SAIR"
					+"=====================================================\n"
					+"Selecione umas das opçoes\n"
					+"OU tecle em 0 para SAIR do programa...\n"
					+"====================================================="
					+"OPCAO: ");
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
