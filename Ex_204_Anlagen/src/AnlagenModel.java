
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AnlagenModel extends AbstractTableModel {

    private static String[] colNames = {"Bezeichnung", "AK", "Inbetriebnahme",
        "ND", "bish. ND", "Afa bisher", "Wert vor ...", "Afa d. J.", "BW 32.12"};
    private ArrayList<Anlage> anlagen = new ArrayList<>();
    private LocalDate year;

    public AnlagenModel(LocalDate year) {
        this.year = year;
    }

    @Override
    public int getRowCount() {
        return anlagen.size();
    }

    @Override
    public int getColumnCount() {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Anlage a = anlagen.get(rowIndex);
        switch(columnIndex) {
            case 0: return a.getName();
            case 1: return a.getAnschaffungsKosten();
            case 2: return a.getInbetriebNahme();
            case 3: return a.getNutzungsdauer();
            case 4: return a.getBishND(year);
            case 5: return a.getAfaBish(year);
            case 6: return a.getBWStartOfYear(year);
            case 7: return a.getAfaThisYear(year);
            case 8: return a.getBWEndOfYear(year);
            default: return "boi";
        }
    }

    private void setYear(LocalDate year) {
        this.year = year;
    }

    public void add(Anlage a) {
    }

    public void remove(int idx) {
    }

    public void load(File f) {
    }

    public void save(File f) {
    }

    public void updateTable() {
    }

}
