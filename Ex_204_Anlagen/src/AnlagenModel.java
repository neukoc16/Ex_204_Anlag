
import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class AnlagenModel extends AbstractTableModel {

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
        return 9;
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

    public void load(File f) {
    }

    public void save(File f) {
    }

    public void updateTable() {
    }

}
