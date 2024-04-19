package br.edu.eteczl.model;

public interface IConta {
    public String getNome(); 
    public int getIdade();
    public String getRg();
    public int getNumConta();
    public void setSaldo(float saldo);
    public float getSaldo();
    public void setSaque(float saque);
    public float getSaque();
    public void status();
    public void deposito(float deposito);
}