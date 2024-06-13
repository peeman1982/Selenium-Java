@google
  Feature: Testing google

    @google1
    Scenario: Virify main page
      Given I open url "https://google.com"
      Then I verify page is opened