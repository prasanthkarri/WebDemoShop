Feature:
@AddCart
Scenario Outline:
 Scenario Outline: : User able to add items into WishList
    Given user launch browser
    And user enters url
    And user clicks on Login button
    And User able to enter his credentials
      | email    | <email1>    |
      | password | <password1> |
    And Verify user able to login successfully
    And User navigates to Books option
    And User selects an Book item
    And user is able to add that item into Add to Cart
    And User Navigates to Shopping Cart section
    And Verify able to checkout item
    And Enters checkout details
    And Verify user is able to process the order or not
    And Logout

    Examples: 
      | email1             | password1 |
      | rahul223@gmail.com | Demo@1234 |
