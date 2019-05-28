#Author: zhu7charlie@gmail.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Component Tests for SalesTaxes
@testCase1   
Scenario: input1.txt --> Sales Taxes: 1.50, Total: 29.83
    Given inputfile1 "input1.txt"    
    Then Sales Taxes1 "1.50", Total1 "29.83"
    
@testCase2   
Scenario: input2.txt --> Sales Taxes: 7.65, Total: 65.15
    Given inputfile2 "input2.txt"    
    Then Sales Taxes2 "7.65", Total2 "65.15"
    
@testCase3   
Scenario: input3.txt --> Sales Taxes: 6.70, Total: 74.68
    Given inputfile3 "input3.txt"    
    Then Sales Taxes3 "6.70", Total3 "74.68"