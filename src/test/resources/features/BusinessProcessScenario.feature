@Test=SmokeTest
Feature: Business Process

  @Test=2
  Scenario Outline: SmokeTest-BusinessProcess
    Given I am on the Application
    When I enter Username: <userName> and password: <password>
    Then logout from application

    Examples: 
      | userName | password |
      | mercury  | mercury  |
      | mercury  | mercury  |
