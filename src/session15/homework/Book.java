package session15.homework;

public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "\"book\": [ \n \"title\": " + "\""+ getTitle() + "\"" + "\n \"author\": " + "\"" + getAuthor() + "\"" + "\n ]";
    }
}

class StringToJson {

    public static void main(String[] args) {

        Book book = new Book("JAVA", "Jane Dou");
        System.out.println(book);
    }
}
