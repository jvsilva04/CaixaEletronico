package conta;

import javax.swing.JOptionPane;

public class Conta {
	private String nome;
	private double saldo;
	public Conta(String nome, double saldoInicial) {
		this.nome = nome;
		if(saldoInicial > 0)
			this.saldo = saldoInicial;
	}
	
	public void depositar(double valor ) {
		if(valor > 0) {
			this.saldo += valor;
		}
	}
	
	public void sacar(double valor) {
		String msg;
		if(valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			msg = String.format("Saldo insulficiente. %n", null);
			JOptionPane.showMessageDialog(null, msg);
		}
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
}
