package BookTests;

import Alexandria.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookGetTest {
    @Test
    public void testGetBook(){
        Book testBook = new Book("Don Quixote", "Cervantes", "Lots of words, trust", 1065);
        assertEquals("Cervantes", testBook.getAuthor(), "Wrong guy");
    }
}
