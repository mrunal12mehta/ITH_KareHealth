Feature:Validating Cancelation Reasons Functionality

  @CancelationReason
  Scenario: Validating Cancel Order Functionality
    Given User navigates to the application
    When User is logged in with valid Credentials
    And User clicks on Login button
    Then User is navigated to the Dashboard
    And User clicks on the toggle button on the top
    Then Menu panel should open
    When Users clicks on Order Management
    Then Order Management SubMenu should open
    When User Clicks on Cancelation Reasons link
    Then Cancelation Reasons List screen should open