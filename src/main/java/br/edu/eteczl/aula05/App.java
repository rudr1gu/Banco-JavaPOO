package br.edu.eteczl.aula05;
import br.edu.eteczl.model.Conta;
import br.edu.eteczl.model.ContaCorrente;
import br.edu.eteczl.model.ContaPoupanca;

public class App {
	public static void main(String[] args) {
		System.out.println("...");
		System.out.println("...");

		Conta pessoa1 = new ContaCorrente("José Pedro", 22, "123.456.543-x", 22341);
		Conta pessoa2 = new ContaPoupanca("Maria Joaquina", 18, "234.451.878-x", 22342);

		pessoa1.setSaldo(110.25f);
		pessoa1.status();
		pessoa1.setSaque(200f);

		System.out.println("...");
		System.out.println("...");

		pessoa2.setSaldo(3000.70f);
		pessoa2.status();
		pessoa2.setSaque(200f);

		System.out.println("...");
		System.out.println("...");
		
		pessoa1.status();
		pessoa1.deposito(250f);
	}

}
