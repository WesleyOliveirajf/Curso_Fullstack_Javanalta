package contaBancaria;

public class ContaBancaria {
    // Atributos

    private String titular;
    private double saldo;

    // Getter e Setter - Metodos padroes para cesar atributos

    // Metodo para obter o titular
    public String getTitular(){
        return titular;
    }

    // metodo para trocar o titular
    public void setTitular(String novoTitular){
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // construtor com atributos
    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    // Construtor sem atributo
    public ContaBancaria() {
    }

    // Construtor que inicializa a conta bancaria com o saldo 0
    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }






}
