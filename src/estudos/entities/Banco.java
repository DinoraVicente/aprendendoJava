package estudos.entities;

public class Banco {
    private int numeroConta;
    private String nome;
    private double saldo;

    public Banco(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    public Banco(int numeroConta, String nome, double depositoInicial){
        this.numeroConta = numeroConta;
        this.nome = nome;
        deposito(depositoInicial);
    }

    public int getNumeroConta(){
        return numeroConta;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        saldo -= valor + 5.0;
    }

    public String toString(){
        return "Número da conta: "
                + numeroConta
                + ", Titular: "
                + nome
                + ", Saldo: R$"
                + String.format("%.2f", saldo);
    }
}
