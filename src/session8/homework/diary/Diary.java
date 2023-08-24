package session8.homework.diary;

import java.time.LocalDate;
import java.util.ArrayList;


public class Diary {

    private ArrayList<Entry> entryList = new ArrayList<>();

    public void addEntry(Entry newEntry) {
        boolean isRepetitive = false;
        isRepetitive = isRepetitiveVerifier(newEntry, isRepetitive);
        if (isRepetitive) {
            System.out.println("Entry with this date all ready exists in Diary!");
            newEntry = null;
        } else {
            inserter(newEntry);
        }
    }

    private boolean isRepetitiveVerifier(Entry newEntry, boolean isRepetitive) {
        for (Entry entry : entryList) {
            if (newEntry.getEntryDate().equals(entry.getEntryDate())) {
                isRepetitive = true;
                break;
            }
        }
        return isRepetitive;
    }

    private void inserter(Entry newEntry) {
        boolean inserted = false;
        for (Entry oldEntry : entryList) {
            if (newEntry.getEntryDate().isAfter(oldEntry.getEntryDate())) {
                entryList.add(entryList.indexOf(oldEntry), newEntry);
                inserted = true;
                break;
            }
        }
        if (!inserted) {
            entryList.add(newEntry);
        }
        System.out.println("Entry added successfully!");

    }


    public void editEntry(LocalDate entryDate, StringBuilder newText) {
        for (Entry entry : entryList) {
            if (entry.getEntryDate().equals(entryDate)) {
                entry.editEntryText(newText);
            }
        }
    }

    public void deleteEntry(LocalDate entryDate) {
        boolean hasRemoved = false;
        for (Entry entry : entryList) {
            if (entry.getEntryDate().equals(entryDate)) {
                entryList.remove(entry);
                hasRemoved = true;
                break;
            }
        }
        if (hasRemoved) {
            System.out.println("Removed successfully!");
        } else {
            System.out.println("Non existing entry!");
        }
    }


    public void displayAllEntries() {
        System.out.println("Displaying all diary entries: ");
        for (int index = 0; index < entryList.size(); index++) {
            System.out.println(entryList.get(index).getEntryText());
            System.out.println("******************************************");
        }
    }
}
