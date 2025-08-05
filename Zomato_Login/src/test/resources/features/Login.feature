Feature: Zomato Login

  Scenario: User login on Zomato with valid details
    Given User is on Zomato login page
    When User enters valid Email and click on send otp
    When User send otp
    And User Verify the otp
    Then User should be successfully login