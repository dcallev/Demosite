@Regression
Feature: Web Automation Demo Site
  As a web user
  Carlos wants to access the Web Automation Demo Site
  To register on the page

  @RunnerTags
  Scenario: Access the page and registered
    Given Camilo wants to access the Web Automation Demo Site
    When he performs the registration on the page
      #| first_name    | last_name | address            | email_address          | phone      | gender | hobbies | languages | skills         | country | select_country | year | month   | day | password       | confirm_password |
      |Camilo |Fernandez |Calle 23 N 24 - 25 |cfernanzdez@prueba.com |3134569586 |Male   |Hockey, Movies, Cricket |Spanish, Catalan  |Ruby |Albania |Japan          |1987 |January |10  |Medellin2019+* |Medellin2019+*   |
    Then he verifies that the screen is loaded with text - Double Click on Edit Icon to EDIT the Table Row.