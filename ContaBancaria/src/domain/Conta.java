package domain;

public class Conta {
	
	private int numero;
	private String titular;
	private double saldo;
	static int qtdcontas;
	
	public Conta(String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
	
	
	public void DadosBancarios() {
		System.out.println("-- DADOS BANCARIO --");
		System.out.println("NUMERO: "+this.numero);
		System.out.println("TITULAR: "+this.titular);
		System.out.println("SALDO: "+this.saldo);
		System.out.println("--------------------");
		System.out.println("");
	}
	public void Depositar(double pValor) {
		System.out.println("-- RELIZAR DEPOSITO --");
		System.out.println("SALDO ATUAL: "+this.saldo);
		
		this.saldo += pValor;
		
		System.out.println("SALDO ATUALIZADO: "+this.saldo);
		System.out.println("-- SALDO REALIZADO COM EXIDO --");
		System.out.println("");
	}

	public void Sacar(double pValor) {
		System.out.println("-- RELIZAR SAQUE --");
		System.out.println("SALDO ATUAL: "+this.saldo);
		if(pValor <= this.saldo) {
			this.saldo -= pValor;
			System.out.println("-- SALDO ATUALIZADO --");
		}
		else {
			System.err.println("-- SALDO INSUFICIENTE --");
		}
		
		System.out.println("-- SAQUE REALIZADO COM EXIDO --");
		System.out.println("");
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	

}
