
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Anlage {

    private final String name;
    private final double anschaffungsKosten;
    private final LocalDate inbetriebNahme;
    private final int nutzungsdauer;

    public Anlage(String line) {
        System.out.println(line);
        String[] array = line.split(";");
        name = array[0];
        anschaffungsKosten = Double.parseDouble(array[1]);
        inbetriebNahme = LocalDate.parse(array[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        nutzungsdauer = Integer.parseInt(array[3]);
    }

    public String getName() {
        return name;
    }

    public double getAnschaffungsKosten() {
        return anschaffungsKosten;
    }

    public LocalDate getInbetriebNahme() {
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
