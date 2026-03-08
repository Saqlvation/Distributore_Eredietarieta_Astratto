
public class MainDistributore {

    public static void main(String[] args) {

        DistributoreAutomatico d1 = new DistributoreAutomatico(50);

        d1.inserisciMoneta(1);
        d1.compraBottiglia();

        System.out.println("Bottiglie rimaste: " + d1.getBottiglie());

        DistributoreSuper d2 = new DistributoreSuper(50, 10);

        d2.inserisciMoneta(1);
        d2.compraBottiglia();
    }
}
