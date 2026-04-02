package entities;

import model.entities.Conta;

public class ContaPoupanca extends Conta {

	
	
	public ContaPoupanca(String titular, double saldo) {
		super(titular, saldo);
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}
	
}