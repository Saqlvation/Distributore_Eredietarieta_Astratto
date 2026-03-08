
public class DistributoreAutomatico {

    protected int bottiglie;
    protected double credito;
    protected double incasso;

    public static final int MAX_BOTTIGLIE = 100;
    public static final double PREZZO = 0.50;

    public DistributoreAutomatico(int bottiglie) {
        this.bottiglie = bottiglie;
        credito = 0;
        incasso = 0;
    }

    public void inserisciMoneta(double moneta) {

        if (moneta == 0.1 || moneta == 0.2 || moneta == 0.5
                || moneta == 1 || moneta == 2) {

            credito += moneta;
        } else {
            System.out.println("Moneta non accettata");
        }
    }

    public void compraBottiglia() {

        if (bottiglie == 0) {
            System.out.println("Bottiglie esaurite");
            return;
        }

        if (credito >= PREZZO) {
            bottiglie--;
            credito -= PREZZO;
            incasso += PREZZO;
            System.out.println("Bottiglia erogata");
        } else {
            System.out.println("Credito insufficiente");
        }
    }

    public int getBottiglie() {
        return bottiglie;
    }

    public void aggiungiBottiglie(int num) {

        if (bottiglie + num <= MAX_BOTTIGLIE) {
            bottiglie += num;
        }
    }

    public double prelevaIncasso() {
        double temp = incasso;
        incasso = 0;
        return temp;
    }
}
