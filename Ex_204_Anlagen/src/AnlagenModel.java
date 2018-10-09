
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
        return "hi";
    }

    private void setYear(LocalDate year) {
        this.year = year;
    }

    public void add(Anlage a) {
    }

    public void remove(int idx) {
    }

    public void save(File f) {
    }

    public void updateTable() {
    }

    public void load(File f) throws FileNotFoundException, IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f))) {
            try {
                Object an;
                while ((an = ois.readObject()) != null) {
                    add((Anlage) an);
                }
            } catch (EOFException ex) {
            }
        }
    }
}
