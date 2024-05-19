Feature: Login functionality
@BrowserInitialization
    Scenario: Verify login Functionality with Valid username and Password
    Given I am on the vendolite website
    When enter valid username "<username>" and password "<password>"
    And I clicked the login button
    Then I should successfully login to the application
 @logout     
       
    
    Examples:
    |username|password|
    |loginuser@riota.in|12345678|
    
  @BrowserInitialization  
    Scenario: Verify login Functionality with Invalid username and Password
    Given I am on the vendolite website
    When enter invalid username "<username>" and password "<password>"
    And I clicked the login button
    Then I should not successfully login to the application
   @logout     
     
     Examples:
    |Invalidusername|Invalidpassword|
    |loginuser@gmail.com|345678|
    
    
    
    