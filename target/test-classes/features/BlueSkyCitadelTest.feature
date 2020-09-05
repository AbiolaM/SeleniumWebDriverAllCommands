Feature: BlueSky Form Test
  Scenario: Form Test
    Given I navigate to blueskycitadelform site
    When I click on Automation Testing Form
    And I enter the Single Line Text

  Scenario: Go  to BlueSkyCitadel website
    Given I navigate to blueskycitadelform site
    And I click on Events
    And I click on EVENTS IN to select month
    And I enter keyword in SEARCH
    Then I close my window
