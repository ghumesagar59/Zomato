Feature: Zomato about us

  Scenario: User navigate the about us 
    Given User is on Zomato home page
    When User click Who We Are navigate and back
    When User click Blog navigate and back
    When User click Work With Us navigate and back
    When User click Investor Relations navigate and back
    When User click Report Fraud navigate and back
    When User click Press Kit navigate and back
    When User click Contact Us navigate and back
  	Then User close the browser