@regression
Feature: Library login feature

User Story:
  As a user, I should be able to login with correct credentials to different accounts. And dashboa
  Accounts are: librarian, student, admin

  Background: For all scenarios user is on the login page of the library application
    Given user is on the login page of the library application

    #this is how we comment in feature file
@librarian
  Scenario: Login as librarian
    When user enters librarian username
    And user enters librarian password
    Then user should see the dashboard

   # @librarian @smoke
    #Scenario: Login as librarian
     # When user enters librarian username
      #And user enters librarian password
      #Then user should see the dashboard


@student
      Scenario: Login as student
        When user enters librarian username
        And user enters librarian password
        Then user should see the dashboard

@admin
        Scenario: Login as admin
          When user enters admin username
          And user enters admin password
          Then user should see the dashboard