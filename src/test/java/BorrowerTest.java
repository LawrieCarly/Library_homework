import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BorrowerTest {

        Borrower borrower;
        Library library;
        Book book1;

    @Before
    public void setUp() {
        borrower = new Borrower();
        library = new Library(50);
        book1 = new Book("Twilight", "R. F. Kaung", "Romance");
    }

    @Test
    public void canGetCollectionSize(){
        borrower.addBook(book1);
        assertEquals(1, borrower.collectionSize());
    }

    @Test
    public void canTakeBookOut(){
        borrower.takeBookOut(library);
        assertEquals(1, borrower.collectionSize());
    }



}