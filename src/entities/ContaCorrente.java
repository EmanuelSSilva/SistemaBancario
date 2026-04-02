package entities;

import interfaces.Autenticar;

public class ContaCorrente extends Conta implements Autenticar {
	
	private String senha;

	public ContaCorrente(String titular, double saldo, String senha) {
		super(titular, saldo);
		this.senha = senha;
	}
	

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
    public boolean autenticar(String senha) {
        return this.senha.equals(senha);
    }


	@Override
	public void sacar(double valor) {
		saldo -= (valor + 2);
		
	}
	
	
	
}
