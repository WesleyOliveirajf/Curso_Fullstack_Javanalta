package EtapadeConstrucao;

public class PlantaCasa {
    // Atributos
    public int metragem;
    public int numeroQuartos;
    public int numeroBanheiros;
    public String cor;
    public String material;

    public void construir() {
        System.out.println(" A casa foi contruida com as caracteristica");
        System.out.println("Metragem: " + metragem);
        System.out.println("NUmero de Quartos " + numeroQuartos);
        System.out.println("Numero de Banheiros: " + numeroBanheiros);
        System.out.println("Material: " + material);

    }

    public void pintar() {
        System.out.println("cor: " + cor);
    }

    public void mudarCorParede(String novacor){
        cor = novacor;
        pintar();
    }


    public int somarMetragem() {
        return metragem * numeroBanheiros + numeroQuartos;
    }

    public void mudarCaracteristicas(int metros, int quartos, int banheiro, String mat){
        metragem = metros;
        numeroQuartos = quartos;
        numeroBanheiros = banheiro;
        material = mat;
        construir();

    }

    public void main(String[] args) {
        //Criando o Objeto casa
        PlantaCasa casa = new PlantaCasa();


        // inicializando os atributos da (variaveis) (Carateristicas) casa

        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "Cinza";

        // chamnada da Fun;á
        casa.construir();
        casa.pintar();
        casa.mudarCorParede("Branco");
        casa.mudarCaracteristicas(100, 2, 3, "Madeira" );

        int resultado = casa.somarMetragem();
        System.out.println(resultado);


        PlantaCasa casaVisinho = new PlantaCasa();
        casaVisinho.metragem = 200;
        casaVisinho.material = " Alvenatia";
        casaVisinho.numeroBanheiros = 1;
        casaVisinho.numeroQuartos = 1;
        casaVisinho.cor = "Amarela";

        casaVisinho.construir();
        casaVisinho.pintar();

    }












}


