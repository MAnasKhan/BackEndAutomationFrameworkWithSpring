# functional-tests

#backend-functional-test

## Running Backend Tests:
1-open src/test/java/runner/runner.java
2-Run Runner class (Reports are not generated)
	OR
1-Run from cmd with mvn clean verify (Reports are generated)


## Verify Reports/Documentation:
1-Goto target/site/serenity/index.html. 
2-Right click on it and open it with browser. 




How is project structure works:
1-DB connection classes should be in utils.
2-Test Case steps classes should be in stepdefenation.
3-Rest methods GET,POST... should be in RestUtilities.
4-Naming convention of Feature files should be same as jira ticket name like 'oss-235'


## Coding Guideline:
1- Always use upper camel-case for class names.
2- Always use lower camel-case for method names.



