package Polimorfismo;

public class Principal {
    public static void main(String[] args) {
        int sabaoPo = 1;
        int mamao = 2;
        double sabonete = 2.50;
        double arroz = 5.90;
        Integer batata = 6;
        Integer cenoura = 8;

        int total = Calculadora.somar(sabaoPo, mamao);
        double totalDoble = Calculadora.somar(sabonete, arroz);
        Integer totalInteger = Calculadora.somar(batata, cenoura);

        Carro fusca = new Carro();
        fusca.mover();

    }
}
