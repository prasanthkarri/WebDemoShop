Feature: User Registration

  Scenario: User regisrtaion with different data
    Given user on registration page
    When user enter following user details
      | prasa | Karri | pras@gmail.com | 9021 | hyd |
      | done  | jim   | Jok@gmail.com  | 0899 | IRE |
    Then User registration should be successfull
