package session9.practice.book_management_sistem;

public class BookManagementSystem {

    public static void main(String[] args) {

        Book book1 = new Book();
        book1.printBookInfo();
        Book book2 = new Book("Harry Potter", 27.89f);
        book2.setTitle("Animal Farm");
        book2.setPrice(39.89f);
        book2.printBookInfo();

        System.out.println(book2.getTitle() + ": " + book2.getPrice());

    }
}
