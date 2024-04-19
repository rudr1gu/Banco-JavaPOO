package br.edu.eteczl.model;

public class ContaPoupanca extends Conta{    
    private float saldo;
    private float saque;

    public ContaPoupanca(String n, int idade, String rg, int numConta) {
        super(n, idade, rg, numConta);
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaque(float saque) {
        if(saldo >= saque){
            this.saque = saque;
            this.saldo = saldo - saque;
            System.out.println("Saque Realizado com Sucesso!");
            System.out.println("Saldo Atual: " + this.getSaldo());

        } else {
            System.out.println("Saldo insulficiente");
            System.out.println("Saldo Disponivel:"+ this.getSaldo());
        }
    }

    public float getSaque() {
        return saque;
    }

    public void status(){
        System.out.println("Nome: "+ this.getNome() );
        System.out.println("Numero da Conta-Poupança: " + this.getNumConta());
        System.out.println("Saldo : " + this.getSaldo());
    }

    public void deposito(float deposito) {
        this.saldo = saldo + deposito;
        System.out.println("Deposito realizado com Sucesso!");
        System.out.println("Saldo Atual: " + this.getSaldo());
    }

}
