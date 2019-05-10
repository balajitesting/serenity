Feature: BusinessProcess 
Scenario Outline: BusinessProcess 
	Given I am on the Application
	When I enter Username: <userName> and password: <password> 
	Then I should be logged in
	And I Navigated to Home Page
	Then I verify username <userName>
	And I click on Business Process Header and select START PROCESS 
	Then I verify Items present in popup.
	And I logout from application
	
	#End of scenario