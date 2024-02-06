package br.com.mvc.tgdi.transacao;

public class Transacao {
	
	public static double depositar(Double valor, Double saldo) {
		System.out.println("Valor atual do seu saldo: " + saldo);
		saldo = saldo + valor;
		System.out.println("Novo valor do seu saldo: " + saldo);

	return saldo;
	}
	
	public static double sacar(Double valor, Double saldo, double taxa) {
		System.out.println("Valor atual do seu saldo: " + saldo);
		if(valor <= saldo){
			System.out.println("o valor da taxa de saco foi de: " + taxa * valor );
			saldo = (saldo - valor) - (taxa * valor);
			System.out.println("Novo valor do seu saldo: " + saldo);
			return saldo;
		}else {
		System.out.println("não possui saldo suficiente");
		System.out.println("seu saldo continua sendo: " + saldo);
		return saldo;
	}
	
}
	

}
