@home
Feature: Naukri Application Home Page Functionalities

@home_01	
 Scenario: Edit Carrer Profile
    Given I navigate to Naukri Application
    
@home_02
Scenario: Update Resume
    Given I navigate to Naukri Application
    And enter the credentials
    When I naviagte to my profile
    And Click on "update" in resume
    And I click on resume that has to be uploaded
    Then Resume should br uploaded successfully
    And I should see profile updated as "Today"