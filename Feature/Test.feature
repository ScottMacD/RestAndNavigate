#Author: Scott MacDonald

@tag
Feature: Demo Feature 1
 

  @tag1
  Scenario: Create, Get, Update, and Delete, Student Information
    Given User enters first name "Scott", last name "Stevens" id "3000", nationality "CA1", and class "3A1"
    And User updates first name "Steve", last name "Jones" id "3001", nationality "CA2", and class "3A2"
    And User get student value by ID with value "2112"
    And User get student value by class with value "3A2"
    And User get student value by ID "2112" and class with value "3A2"
    And User deletes student value by ID with value "3001"
    
     Scenario: User Logs In Successfully
    Given User navigates to Login Page
    And User enters username "tomsmith" and password "SuperSecretPassword!"
    And validates successful login
    
    
		Scenario: User Logs In Unsuccessfully with incorrect password
   	Given User navigates to Login Page
    And User enters username "tomsmith" and password "SuperSecretPassword"
    And validates unsuccessful login with "password" issue 
    
    Scenario: User Logs In Unsuccessfully with incorrect username
   	Given User navigates to Login Page
    And User enters username "tomjones" and password "SuperSecretPassword!"
    And validates unsuccessful login with "username" issue 
    

   