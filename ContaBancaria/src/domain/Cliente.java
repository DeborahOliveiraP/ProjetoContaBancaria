package domain;

public class Cliente extends Conta implements Autentica {
	
	public Cliente(String pTitular) {
		super(pTitular);
		// TODO Auto-generated constructor stub
	}
	
	private int id;
	private int cpf;
	private int rg;
	private String nome;
	private int senha;
	private int codigo;
	
	public boolean AutenticaSenha(int senha) {
        if(this.senha != senha) {
            return false;
        }
        return true;
    }
	
	public boolean AutenticaCodigo(int codigo) {
        if(this.codigo != codigo) {
            return false;
        }
        return true;
    }
	
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
	
}
