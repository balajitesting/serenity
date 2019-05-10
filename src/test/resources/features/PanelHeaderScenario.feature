Feature: Panel Header

Scenario: Panel Header
Given I am on the Application
When I enter Username: qualitest and password: Demo@ccess
Then I verify home page with Username: qualitest
And I Select Header: Panels and option: Jobs
Then I verify Panel is visible in home page: Jobs
And I Select Header: Panels and option: Batches
Then I verify Panel is visible in home page: Batch
And I logout from application
When I enter Username: searchpanel and password: test
Then I verify error message







