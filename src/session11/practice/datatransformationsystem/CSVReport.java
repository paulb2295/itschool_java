package session11.practice.datatransformationsystem;

import java.util.List;

class CSVReport extends Report implements CSVExportable {

    CSVReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
    }

    @Override
    public void exportToCsv() {
    }
}