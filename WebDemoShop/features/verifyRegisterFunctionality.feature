Feature: Verify application register functionality

  @Register @P0
  Scenario Outline: User able to register in the application
    Given user launch browser
    And user enters url
    And click on Register button
    And user filled the registration form
      | gender          | <gender1>         |
      | firstName       | <firstName1>      |
      | lastName        | <lastName1>       |
      | email           | <email1>          |
      | password        | <password1>       |
      | confirmPassword | <confirmPassword> |
    And user click on register button
    Then verify success message
    And Logout

    Examples: 
      | gender1 | firstName1 | lastName1 | email1               | password1 | confirmPassword |
      | male    | rahul223   | rahul     | rahul223@gmail.com   | Demo@1234 | Demo@1234       |
      | male    | rahul223ff | rahulrr   | rahurrl223@gmail.com | Demo@1234 | Demo@1234       |
