Feature: Browse List

  Scenario Outline: Browse Userlist
    When We click button of user List
    Then Select user data from DB
    And Shows the user data
    Examples:
      |name| info|
      |first|dalong|


  Scenario Outline: Browse Deptlist
    When We click button of dept List
    Then Select dept data from DB
    And Shows the dept data
    Examples:
      |name| info|
      |first|dalong|