package herança;

public class Principal {
    public static void main(String[] args) {

        Cachorro caramelo = new Cachorro();
        caramelo.latir();
        caramelo.comer("Ração");
        caramelo.beberAgua();
        caramelo.dormir();

        System.out.println("===========================================================");

        Galinha gertrudez = new Galinha();
        gertrudez.ciscar();
        gertrudez.comer("Milho");
        gertrudez.beberAgua();
        gertrudez.dormir();



    }
}
