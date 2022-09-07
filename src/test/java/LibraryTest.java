import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void setUp() {
        library = new Library(50);
        book1 = new Book("Twilight", "R. F. Kaung", "Romance");
        book2 = new Book("Harry Potter", "JK Rowling", "Fantacy");
        book3 = new Book("Lord of the Rings", "R. F. Kaung", "Horror");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    public void CanAddBook(){
        library.addBook(book1);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void checkStockIsFull(){
        assertFalse(library.fullStock());
    }

    @Test
    public void CanRemoveBook(){
        library.addBook(book1);
        library.removeBook();
        assertEquals(3, library.stockCount());
    }


}