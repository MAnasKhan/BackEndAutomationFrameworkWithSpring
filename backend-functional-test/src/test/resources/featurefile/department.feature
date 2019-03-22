Feature: List of Departments

Scenario Outline: Perform a get request and verify departments.

Given perform a get request on departments
When verify the status '<code>'
Then verify json schema
Then verify department names should be "<department1>" and "<department2>"

Examples:
|department1| department2|code|
|Accesories | Mobiles|200|


Scenario Outline: Search with filters.

Given a user has some search filters
When users hit search with specified filters
Then verify the status '<code>'
And  verify all products are relaed to specified filters like "<searchFilter>"


Examples:
|searchFilter| code|
|Iphone6 | 200|