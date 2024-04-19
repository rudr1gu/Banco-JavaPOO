package br.edu.eteczl.model;

public abstract class Conta implements IConta{
	private String nome;
	private int idade;
	private String rg;
    private int numConta;

	public Conta(String nome, int idade, String rg, int num) {
		this.nome = nome;
		this.idade = idade;
		this.rg = rg;
        this.numConta = num;
	}

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getNumConta() {
        return numConta;
    }

    @Override
    public String getRg() {
        return rg;
    }

    


}
