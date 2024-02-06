package br.com.mvc.tgdi;

import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.mvc.tgdi.model.Cliente;
import br.com.mvc.tgdi.model.Empresa;
import br.com.mvc.tgdi.validator.ValidadorCNPJ;
import br.com.mvc.tgdi.validator.ValidadorCpf;

@SpringBootApplication
public class TgdiApplication implements CommandLineRunner {
	public
 static void main(String[] args) {
		SpringApplication.run(TgdiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {        	
		Scanner ler = new Scanner(System.in);
		boolean validacao = false;
		
		System.out.println("Cadastrando um Cliente. Porfavor informe o CPF dele: ");
		String cpf;
		cpf = ler.next();
		
		Cliente cliente = new Cliente(cpf);
		System.out.println("cpf do cliente cadastrado foi : " + ValidadorCpf.imprimeCPF(cpf));
		System.out.println("CPF invalido, por favor coloque um valido");

		
		System.out.println("Cadastrando uma Empresa. Porfavor informe o CNPJ dele: ");
		String cnpj;
		cnpj = ler.next();
		
		System.out.println("informe a taxa de transacao e utilize virgulas: ");
		Double taxaTransacao;
		taxaTransacao = ler.nextDouble();
		
		Empresa empresa = new Empresa(cnpj, taxaTransacao);
		System.out.println("CNPJ do cliente cadastrado foi : " + ValidadorCNPJ.imprimirCnpj(cnpj));
		
		System.out.println("Saldo inicial da sua empresa e de R$ 5.000");
		System.out.println("Gostaria de depositar ou sacar");
		System.out.println("digite 1 para depositar, 2 para sacar, 3 consultar seu CNPJ, 4 consultar o CPF do cliente e 9 ora sair");

		int opcao = ler.nextInt();
		
		while(opcao != 9){
	
			switch (opcao) {

		case 1:
			System.out.println("Coloque o calor que gostaria de depositar.");
			double valor = ler.nextDouble();
			empresa.depositar(valor);
			System.out.println("digite 1 para depositar, 2 para sacar, 3 consultar seu CNPJ, 4 consultar o CPF do cliente e 9 ora sair");
			opcao = ler.nextInt();
			break;
			
		case 2:		
			System.out.println("Coloque o calor que gostaria de sacar.");
			valor = ler.nextDouble();
			empresa.sacar(valor);
			System.out.println("digite 1 para depositar, 2 para sacar, 3 consultar seu CNPJ, 4 consultar o CPF do cliente e 9 ora sair");
			opcao = ler.nextInt();
			break;
			
		case 3:
			System.out.println("seu CNPJ: "+ ValidadorCNPJ.imprimirCnpj(cnpj));
			System.out.println("digite 1 para depositar, 2 para sacar, 3 consultar seu CNPJ, 4 consultar o CPF do cliente e 9 ora sair");
			opcao = ler.nextInt();
			break;
			
		case 4:		
			System.out.println("seu CPF: "+ ValidadorCpf.imprimeCPF(cpf));
			System.out.println("digite 1 para depositar, 2 para sacar, 3 consultar seu CNPJ, 4 consultar o CPF do cliente e 9 ora sair");
			opcao = ler.nextInt();
			break;
			
		case 9:
			break;
			
		default:
			System.out.println("opção invalida");
			break;
		}
	}
		
	}


}


