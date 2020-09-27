Feature: Todo

  Scenario: As user
  I want to add a new task
  using required title and note
  So that I can save my task

    Given I have open my todo app
    When I click add button
    And I type 'Test' in title textbox in todoapp activity
    And I type 'Note test' in note textbox in todoapp activity
    And I click on the save button in todoapp activity
    Then Task is created

  Scenario: As user
  I want to search a task
  using textbox for searching
  So that I can search tasks

    Given I have open my todo app
    When I click in the button of searching
    And I type 'Test' in search textbox in todoapp activity
    Then Search shows elements found

