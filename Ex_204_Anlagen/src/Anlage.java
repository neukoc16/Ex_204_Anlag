

public class Anlage {

    private final String name;
    private final double anschaffungsKosten;
    private final double inbetriebNahme;
    private final int nutzungsdauer;

    public Anlage(String line) {
        line = line.replace(".", "");
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

    public double getBishND(double year) {
        return year - inbetriebNahme;
    }

    public double getAfaBish(double year) {
        if(getBishND(year) < 0)
            return 0;
        if(getBishND(year) > nutzungsdauer)
            return anschaffungsKosten;
        return getBishND(year) * (anschaffungsKosten / nutzungsdauer);
    }

    public double getAfaThisYear(double year) {
        if(getBishND(year) < 0)
            return 0;
        if(getBishND(year) > nutzungsdauer)
            return 0;
        if(getBishND(year) < .6 || getBishND(year) > (nutzungsdauer - .6))
            return (anschaffungsKosten / nutzungsdauer) / 2;
        return anschaffungsKosten / nutzungsdauer;
    }

    public double getBWStartOfYear(double year) {
        if(getBishND(year) < 0)
            return 0;
        if(getBishND(year) > nutzungsdauer)
            return 0;
        return anschaffungsKosten - getAfaBish(year);
    }

    public double getBWEndOfYear(double year) {
        return getBWStartOfYear(year) - getAfaThisYear(year);
    }
}
