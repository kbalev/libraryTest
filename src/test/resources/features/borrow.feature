Feature: borrow a book in a best-case scenario
  Scenario: Check borrowing is successful
    Given book exists and that
    And  book is not borrowed
    When the patron borrows the book
    Then patron should be told "thank you for using the library"
  Scenario: Check borrowing can't be done on a borrowed book
      Given book exists and that
      And  book is borrowed
      When the patron borrows the book
      Then patron should be told "book is not available at this time"
