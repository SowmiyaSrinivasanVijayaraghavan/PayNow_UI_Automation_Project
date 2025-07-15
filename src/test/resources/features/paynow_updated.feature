Feature: PayNow form submission

  Scenario: Submit PayNow payment with valid details
    Given User opens the PayNow form
    When User enters mobile number "91234567"
    And User enters amount "50.00"
    And User enters reference "Invoice123"
    And User clicks the Submit button
    Then Confirmation message should be displayed
    
  Scenario: PayNow form submission with empty mobile number
  Given User opens the PayNow form
  When User enters amount "50.00"
  And User enters reference "Invoice123"
  And User clicks the Submit button
  Then Mobile number error message should be displayed