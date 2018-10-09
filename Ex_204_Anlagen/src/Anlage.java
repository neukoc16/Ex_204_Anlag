
import java.time.LocalDate;

public class Anlage {

    private final String name;
    private final double anschaffungsKosten;
    private final double inbetriebNahme;
    private final int nutzungsdauer;

    public Anlage(String line) {
        System.out.println(line);
        line = line.replace(",", ".");
        String[] array = line.split(";");
        name = array[0];
        anschaffungsKosten = Double.parseDouble(array[1]);
        inbetriebNahme = Double.parseDouble(array[2]);
        nutzungsdauer = Integer.parseInt(array[3]);
    }

    public String getName() {
        return name;
    }

    public double getAnschaffungsKosten() {
        return anschaffungsKosten;
    }

    public double getInbetriebNahme() {
        return inbetriebNahme;
    }

    public int getNutzungsdauer() {
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
