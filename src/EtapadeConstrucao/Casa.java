package EtapadeConstrucao;

public class Casa {
    public static void main(String[] args) {
        // Criando Objeto EtapadeConstrucao.Casa
        PlantaCasa casa = new PlantaCasa();

        // Inicializando Atribudos casa
        casa.numeroBanheiros = 2;
        casa.numeroQuartos = 3;
        casa.metragem = 70;
        casa.material = "Tijolo";
        casa.cor = "cinza";

        casa.construir();
        casa.pintar();
    }


}
