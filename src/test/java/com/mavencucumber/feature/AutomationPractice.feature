#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps

Feature:Automation Test End to End
Scenario: Login The Application
Given: launch the browser
And:enter email id
And: enter password
Then: verify user name displayed in header