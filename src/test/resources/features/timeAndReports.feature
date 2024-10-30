Feature:
  As a user, I should be able to access to the time reports
  1. User should be able to see the 5 modules on the “Time and Reports” page.
  2. User should be able to see 2 checkboxes on the “Worktime” module.
  3. “Statistics” checkbox should be selected by default.


  Background:
    Given the user is on the login page


  Scenario Template: Verify access to Time and Reports menu
    When the user logs in as "<user type>"
    And the user navigates to the Time and Reports menu
    Then the user should see the following five modules
      | Absence Chart          |
      | Worktime               |
      | Bitrix24.Time          |
      | Work Reports           |
      | Meetings and Briefings |
    When the user navigates to the Worktime module
    Then the user should see 2 checkboxes in the Worktime module
    And the Statistics checkbox should be selected by default

    Examples:
      | user type |
      | hr        |
      | helpdesk  |
      | marketing |