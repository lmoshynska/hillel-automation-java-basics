package lesson15;

import java.util.ArrayList;
import java.util.List;

public class CollectionsMain {

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        Book book1 = new Book("Harry Potter", 1000);
        Book book2 = new Book("Harry Potter", 1000);

        books.add(book1);
        books.add(new Book("Book1", 200));
        books.add(new Book("Book2", 100));
        books.add(new Book("Book3", 300));
        books.add(new Book("Book4", 200));

        /*for (Book b : books) {
            System.out.println("Pages q-ty: " + b.getPages());
        }*/

        System.out.println(books.contains(book2));
    }
}
