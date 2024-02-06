package br.com.mvc.tgdi.model;

import br.com.mvc.tgdi.transacao.Transacao;
import br.com.mvc.tgdi.validator.ValidadorCNPJ;

public class Empresa {

    private String cnpj;
    private double taxaTransacao;
    private double saldo = 5000.0;

    public Empresa(String cnpj, double taxaTransacao){
        if (ValidadorCNPJ.isCnpj(cnpj)){
        this.cnpj = cnpj;
        } else {
        	System.out.println("CNPJ Inválido");
        }
        this.taxaTransacao = taxaTransacao;
    }
    
    public double depositar(Double valor) {
    	return this.saldo = Transacao.depositar(valor, this.saldo);
    	
    }
    
    public double sacar(Double valor) {
    	return this.saldo = Transacao.sacar(valor, this.saldo, this.taxaTransacao);
    	
    }

	public String getCnpj() {
		return cnpj;
	}

	public double getTaxaTransacao() {
		return taxaTransacao;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

    
    
}
