package entities;

public abstract class Conta {
	
	protected String titular;
    protected double saldo;

    public Conta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }
    
    
	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		if( titular != null && !titular.isEmpty()) {
			this.titular = titular;
		}
	}


	public double getSaldo() {
		return saldo;
	}


	public abstract void sacar(double valor);

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(Conta destino, double valor) {
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------");
    }

   
}
