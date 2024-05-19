Feature: Login functionality
@BrowserInitialization
    Scenario: Verify login Functionality with Valid username and Password
    Given I am on the vendolite website
    When enter valid username "<username>" and password "<password>"
    And I clicked the login button
    And I navigated to account section to upload image
    And i uploaded the image path "<path>" in image section
    Then I should see the uploaded image
 @logout     
       
    
    Examples:
    
    |username|password|path|
    |loginuser@riota.in|12345678|C:\\Users\\chandru\\Hulk.png|