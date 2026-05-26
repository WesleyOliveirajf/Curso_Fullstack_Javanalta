package contaBancaria;

public class Agencia {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("Wesley", 500);
        System.out.println("Titular da Conta e: " + minhaConta.getTitular());
        System.out.println("Saldo da Conta e: " + minhaConta.getSaldo());

        minhaConta.setTitular("Wesley Oliveira");
        minhaConta.setSaldo(minhaConta.getSaldo()+500);

        String titularConta = minhaConta.getTitular();
        double saldoFinal = minhaConta.getSaldo();

        System.out.println(" O titular da conta e: " + titularConta + ", e o saldo da conta e : " + saldoFinal);

        ContaBancaria contaMinhaEsposa = new ContaBancaria("Kely");
        contaMinhaEsposa.setTitular("Kely Madera");


    }
}
