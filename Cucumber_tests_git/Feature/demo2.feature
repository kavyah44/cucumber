Feature: login Feature

Scenario Outline: User enters username and password
Given user should open the application
When user should click on to login link
And user enters "<username>" and "<password>"
Then message displayed Login Succesfully

Examples:
| username                       | password   |
| aravind.guggilla57@gmail.com   | aravind    |
| aravindkumarguggilla@gmail.com | Aravind@123|