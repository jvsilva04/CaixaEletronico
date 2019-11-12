package conta;

import javax.swing.JOptionPane;

public class principal {

	public static void main(String[] args) {
		String nome, mensagem, fim;
		double saldoInicial, deposito, saque;
		int x;

		nome= JOptionPane.showInputDialog("Insira o nome do cliente da conta: \n");

		saldoInicial= Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo inicial da conta: \n"));

		Conta minhaConta = new Conta(nome, saldoInicial);
		do {
		x = Integer.parseInt(JOptionPane.showInputDialog("Escolha a função desejada: \n"+"1 - Depositar \n"+"2 - Sacar \n"+"3 - Consultar \n"+"0 - Sair"));

		switch(x) {
		case 1:
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de depósito: \n"));

		minhaConta.depositar(deposito);
		break;
		case 2:
		saque= Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de depósito: \n"));

		minhaConta.sacar(saque);
		break;
		case 3:
		mensagem = String.format(""+"Nome da conta: %s%n"+"Saldo dispónivel: %f%n", minhaConta.getNome(),minhaConta.getSaldo());

		JOptionPane.showMessageDialog(null, mensagem);

		break;
		case 0:
			fim= String.format("Desenvolvido por João Victor da Silva %n", null);
			JOptionPane.showMessageDialog(null, fim);
		break;
		}
		}while(x!=0);

		
	}

}
