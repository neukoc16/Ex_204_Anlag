
import java.time.LocalDate;

public class Anlage {

    private String name;
    private double anschaffungsKosten;
    private LocalDate inbetriebNahme;
    private int nutzungsdauer;

    public Anlage(String name, double anschaffungsKosten, LocalDate inbetriebNahme, int nutzungsdauer) {
        this.name = name;
        this.anschaffungsKosten = anschaffungsKosten;
        this.inbetriebNahme = inbetriebNahme;
        this.nutzungsdauer = nutzungsdauer;
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
