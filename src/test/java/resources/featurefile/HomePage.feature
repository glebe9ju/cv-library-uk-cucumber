Feature: Create Home Test
  As user I want to login into cv-library website

  Scenario Outline: User should verify job search result using different data set

    Given I am on homepage
    When I enter job title "<jobTitle>"
    And I enter location "<location>"
    And I select distance "<distance>"
    And I click on more search option link
    And I enter salary min "<salaryMin>"
    And I enter salary max "<salaryMax>"
    And I select salary type "<salaryType>"
    And I select jobType "<jobType>"
    And I click on find jobs button
    Then I verify the result "<result>"

    Examples:

      | jobTitle        | location        | distance       | salaryMin | salaryMax | salaryType | jobType   | result                                           |
      | Tester          | Harrow          | up to 5 miles  | 30000     | 500000    | Per annum  | Permanent | Permanent Tester jobs in Harrow on the Hill      |
      | Test Analyst    | Manchester      | up to 15 miles | 32000     | 50000     | Per annum  | Permanent | Permanent Test Analyst jobs in Manchester        |
      | Developer       | Hampshire       | up to 7 miles  | 32000     | 51000     | Per annum  | Permanent | Permanent Developer jobs in Hampshire            |
      | Test Engineer   | Hertfordshire   | up to 10 miles | 35000     | 55000     | Per annum  | Permanent | Permanent Test Engineer jobs in Hertfordshire    |
      | Test Manager    | Longfield, Kent | up to 15 miles | 37000     | 60000     | Per annum  | Permanent | Permanent Test Manager jobs in Longfield         |
      | Test Technician | Greater London  | up to 10 miles | 40000     | 60000     | Per annum  | Permanent | Permanent Test Technician jobs in Greater London |
