
import java.time.LocalDate;

public class Anlage {

    private final String name;
    private final double anschaffungsKosten;
    private final LocalDate inbetriebNahme;
    private final int nutzungsdauer;

    public Anlage(String line) {
        String[] array = line.split(";");
        name = array[0];
        anschaffungsKosten = Double.parseDouble(array[1]);
        inbetriebNahme = LocalDate.parse(array[2]);
        nutzungsdauer = Integer.parseInt(array[3]);
    }

    private String getName() {
        return name;
    }

    private double getAnschaffungsKosten() {
        return anschaffungsKosten;
    }

    private LocalDate getInbetriebNahme() {
        return inbetriebNahme;
    }

    private int getNutzungsdauer() {
        return nutzungsdauer;
    }

    public double getBishND(LocalDate year) {
        return 0;
    }

    public double getAfaBish(LocalDate year) {
        return 0;
    }

    public double getAfaThisYear(LocalDate year) {
        return 0;
    }

    public double getBWEndOfYear(LocalDate year) {
        return 0;
    }

    public double getBWStartOfYear(LocalDate year) {
        return 0;
    }
}
