package lesson15;

import java.util.Objects;

public class Book {

    private String title;
    private int pages;


    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }


    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return pages == book.pages && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, pages);
    }
}
