Feature: Validating login functionality

  Scenario: Login to KareHealth with valid credentials
    Given : User navigates to the application
    When : User provides valid credential
    And : User clicks on Login button
    Then : User is navigated to the Dashboard

  Scenario: Opening Menu panel of KareHealth
    Given User is logged in with valid Credentials
    When User clicks on the toggle button on the top
    Then Menu panel should open

  Scenario: Opening Order List Screen
    Given Menu panel should open
    When Users clicks on Order Management
    Then Order Management SubMenu should open

  Scenario: Open Order List page
    Given User is logged in with valid Credentials
    And Menu panel should open
    When User Clicks on Orders link
    Then Order List screen should open

  Scenario:Opening Setting Page for Administrator User
    Given Order List screen should open
    When User clicks on Logged in User name
    And User clicks on Setting Button
    Then User Setting screen should open

  Scenario: Logout from KareHealth Application
    Given User Setting screen should open
    When User clicks on Logged in User name
    And User clicks on Logout button
    Then User is Logged out of KareHealth Application

  Scenario: Login to KareHealth with invalid Credentials
    Given : User navigates to the application
    When User provides invalid credential
    Then Credential do not match message is displayed
