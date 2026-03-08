
public class DistributoreSuper extends DistributoreAutomatico {

    private double cassettoResto;

    public DistributoreSuper(int bottiglie, double resto) {
        super(bottiglie);
        cassettoResto = resto;
    }

    public void compraBottiglia() {

        if (bottiglie == 0) {
            System.out.println("Bottiglie finite");
            return;
        }

        if (credito >= PREZZO) {

            double resto = credito - PREZZO;

            if (cassettoResto >= resto) {

                bottiglie--;
                incasso += PREZZO;

                cassettoResto -= resto;

                credito = 0;

                System.out.println("Bottiglia erogata");
                System.out.println("Resto: " + resto);
            } else {
                System.out.println("Resto non disponibile");
            }
        } else {
            System.out.println("Credito insufficiente");
        }
    }
}
