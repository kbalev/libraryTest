import alexandria.Book;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class borrowStepDefinitions {

    public Book testBook = new Book("Count of Monte Cristo");

    @Given("book exists and that")
    public void bookExistsAndThat() {
        testBook.getTitle();
    }

    @And("book is not borrowed")
    public void bookIsNotBorrowed() {
        testBook.bringBack();
    }

    @When("the patron borrows the book")
    public void thePatronBorrowsTheBook() {
        testBook.borrow();
    }

    @Then("patron should be told {string}")
    public void patronShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, testBook.borrow());
    }

    @And("book is borrowed")
    public void bookIsBorrowed() {
        testBook.borrow();
    }
}
