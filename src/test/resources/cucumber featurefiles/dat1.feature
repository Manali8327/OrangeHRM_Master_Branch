Feature: search text on google

  @text_search
  Scenario Outline: Verify search context field with < text to besearch>
    Given user is already on google home page
    When user enters "< text to besearch>" in search field
    And user click on search button
    Then Verify the title of the page With "< text to besearch>"
    

    Examples: 
      | text to besearch        |
      | Selenium                |
      | Java interview quetions |
