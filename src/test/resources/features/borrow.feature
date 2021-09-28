Feature: borrow a book in a best-case scenario
  Scenario: Check borrowing is successful
    Given the book exists
    And  book is available
    When the patron borrows the book
    Then patron should be told "You have borrowed this item."

  Scenario: Check borrowing can't be done on a borrowed book
      Given the book exists
      And  book is borrowed
      When the patron borrows the book
      Then patron should be told "The item you are trying to borrow is not available at this time."
