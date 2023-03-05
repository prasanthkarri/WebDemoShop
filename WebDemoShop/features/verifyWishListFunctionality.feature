Feature: Verify WishList feature functionality

  @Wishlist @P0
  Scenario Outline: : User able to add items into WishList
    Given user launch browser
    And user enters url
    And user clicks on Login button
    And User able to enter his credentials
      | email    | <email1>    |
      | password | <password1> |
    And Verify user able to login successfully
    And User navigates to jewerly option
    And User selects an item
    And user is able to add that item into Add to WishList
    #Then User able lo to success message
    And User Navigates to Wishlist section
    And Verify able to see respective item
    And Logout

    Examples: 
      | email1             | password1 |
      | rahul223@gmail.com | Demo@1234 |
