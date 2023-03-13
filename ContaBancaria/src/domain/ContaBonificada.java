package domain;

public class ContaBonificada extends Conta {
	 private double bonus;

	    public ContaBonificada(String numero, String titular, double saldo) {
	        super(numero);
	        this.bonus = 0;
	    }

	    public void depositarBonus(double valor) {
	        this.bonus += valor;
	        Depositar(valor);
	    }

	    public double getBonus() {
	        return bonus;
	    }
	}
