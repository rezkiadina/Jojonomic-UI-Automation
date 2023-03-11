@Jojonomic
  Feature: Validation Navigation Page

    Scenario: Validation Navigation Page
      Given user open the web page
      When user input "Apply for a number plate" to search
      Then user click button search
      And navigation web is valid

    Scenario Outline: User search suburb
      Given user open the web page
      When user click on Locate us button
      Then locate page is display
      Then user enter suburb "<suburb>"
      And user click button search suburb
      And should use service centre named as "<name>"
      Examples:
        | suburb                       | name                          |
        | Sydney 2000                  | Marrickville Service Centre   |
        | Sydney Domestic Airport 2020 | Rockdale Service Centre       |
        | Sydney University 2006       | Wee Waa Mobile Service Centre |
