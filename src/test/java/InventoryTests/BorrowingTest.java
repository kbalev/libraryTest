package InventoryTests;

import alexandria.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BorrowingTest {

    @Test
    public void requestTest(){
        Book testBook = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        assertEquals("Your book is available for collection, please proceed to the next step.", testBook.request(), "Book is not available for borrowing at creation");
    }
    @Test
    public void requestFailTest(){
        Book testBook = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        testBook.borrow();
        assertEquals("Unfortunately, your book is not available at this time. Please try again later.", testBook.request(), "Book should not be available for borrowing at this point.");
    }
    @Test
    public void borrowTest(){
        Book testBook = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        assertEquals("You have borrowed this item.", testBook.borrow(), "Borrowing does not correctly flag a book as borrowed");
    }
    @Test
    public void borrowFailTest(){
        Book testBook = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        testBook.borrow();
        assertEquals("The item you are trying to borrow is not available at this time.", testBook.borrow(), "Borrowing does not correctly flag a book as borrowed");

    }
    @Test
    public void bringBackTest(){
        Book testBook = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        testBook.borrow();
        assertEquals("Thank you for bringing back this item.", testBook.bringBack(), "Returning a book does not work as intended.");
    }
    @Test
    public void bringBackFailTest(){
        Book testBook = new Book("Valdor", "Chris Wright", "It's a book about a big hulking man who isn't the biggest guy around but is very close to.", 400);
        assertEquals("You cannot return an item that has not been borrowed.", testBook.bringBack(), "Returning a book does not work as intended.");

    }
}
