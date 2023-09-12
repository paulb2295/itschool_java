package session11.practice.datatransformationsystem;

import java.util.List;

class PDFReport extends Report implements PDFExportable {

    PDFReport(String title, List<String> data) {
        super(title, data);
    }

    @Override
    public void showPreview() {
    }

    @Override
    public void exportToPdf() {
    }
}
