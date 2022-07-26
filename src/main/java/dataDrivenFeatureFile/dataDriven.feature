Feature: import excel data and print in console
  Scenario: import excel data and print
    Given import excel data
      |animal|counts|color|
      | cow   |1|blue     |
      | horse |2|red      |
      | sheep |3|white    |
#        |Cucumber Sandwich|2|20|
#        |ID|NameF|Weight       |
    When print in console