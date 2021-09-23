package BookTests;

import Alexandria.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookSetTest {
    Book testBook = new Book("Don Quixote", "Cervantes", "Lots of words, trust", 1065);
    @Test
    public void setTitleTest(){
        testBook.setTitle("Silmarilion");
        assertEquals("Silmarilion", testBook.getTitle() , "Still the same book");
    }
}
