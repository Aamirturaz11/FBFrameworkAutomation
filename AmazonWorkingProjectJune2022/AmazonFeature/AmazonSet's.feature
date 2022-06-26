@FbValidLogin
Feature:  Login Testcases set

  Scenario: Login in to  Application
    Given Open Browser
    When Enter the Valid URL
    And Users Takes the Screenshot
    When Enter the Valid Email ID
    And Users Takes the Screenshot
    And Enter the Valid Password
    And Users Takes the Screenshot
    And Click on Login Button
    And Users Takes the Screenshot
    And Two Fector Verication 
    And Users Takes the Screenshot
    And User Clicked on SignOut Button
    And Users Takes the Screenshot
    Then Browser is Closed

@FbinValidLogin1
  Scenario: Invalid Login Check via Invalid Mobile Number in the Application
    Given Open Browser
    When Enter the Valid URL
    And Users Takes the Screenshot
    When Enter the InValid Email ID
    And Users Takes the Screenshot
    And Enter the Valid Password
    And Users Takes the Screenshot
    And Click on Login Button
    And Users Takes the Screenshot 
    Then Browser is Closed
    
@FbinValidLogin2
  Scenario: Invalid Login Check via Invalid Password in the Application
   
    Given Open Browser
    When Enter the Valid URL
    And Users Takes the Screenshot
    When Enter the Valid Email ID
    And Users Takes the Screenshot
    And Enter the InValid Password
    And Users Takes the Screenshot
    And Click on Login Button
    And Users Takes the Screenshot
    Then Browser is Closed
    
@FbinValidLogin3
  Scenario: Invalid Login Check via Invalid Mobile Number or Invalid Password in the Application
   
    Given Open Browser
    When Enter the Valid URL
    And Users Takes the Screenshot
    When Enter the InValid Email ID
    And Users Takes the Screenshot
    And Enter the InValid Password
    And Users Takes the Screenshot
    And Click on Login Button
    And Users Takes the Screenshot
    Then Browser is Closed
    
    @FbinValidLogin4
  Scenario: Invalid Login Check via Blank Mobile Number or Blank Password in the Application
   
    Given Open Browser
    When Enter the Valid URL
    And Users Takes the Screenshot
    When Enter the  Email ID as blank via Enter the Password as blank
    And Click on Login Button
    And Users Takes the Screenshot
    Then Browser is Closed
    