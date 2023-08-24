package session8.homework.diary;

import java.time.LocalDate;

public class Entry {

    private final LocalDate entryDate;
    private StringBuilder entryText = new StringBuilder();

    public Entry(LocalDate entryDate) {
        this.entryDate = entryDate;
        this.entryText.append(this.entryDate.toString() + ": ");
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public StringBuilder getEntryText() {
        return entryText;
    }

    public void editEntryText(StringBuilder entryText) {
        this.entryText.delete(0, this.entryText.length());
        this.entryText.append(entryDate.toString() + ": " + entryText);
    }
}
