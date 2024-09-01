Feature: Login page of OrageHRm

  @Login_with_crendentials
  Scenario Outline: login with given <Flow> crendientials
    Given User is on login page
    When User enters "<username>" and "<password>"
    Then Verify the title of page

    Examples: 
      | Flow | username | password |
      | Valid | Admin| admin123|
      |invalid | admin23 | admin234|