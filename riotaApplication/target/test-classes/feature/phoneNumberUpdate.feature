Feature: Login functionality
@BrowserInitialization
    Scenario: Verify login Functionality with Valid username and Password
    Given I am on the vendolite website
    When enter valid username "<username>" and password "<password>"
    And I clicked the login button
    And I navigated to account section
    And i Update the phone number in phone number field
    Then Update should be success
 @logout     
       
    
    Examples:
    
    |username|password|
    |loginuser@riota.in|12345678|