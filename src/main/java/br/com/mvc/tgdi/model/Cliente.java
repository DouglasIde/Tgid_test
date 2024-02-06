package br.com.mvc.tgdi.model;

import br.com.mvc.tgdi.validator.ValidadorCpf;

public class Cliente {

    private String cpf;


    public String getCpf() {
		return cpf;
    }

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}



	public Cliente(String cpf) {
        if (ValidadorCpf.isCPF(cpf)) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF Inválido");
        }
    }

}
