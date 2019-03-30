@mailTest
Feature: Test mail page
Background:
   Given I am on mail page

Scenario:Test move letter for spam
       When I move letter to spam
       Then I see message "Letter moved to spam"
Scenario: Test extract letter to spam
       When I open spam folder
       When I extract the letter in spam
       Then I see letter in spam  
Scenario: Test send letter for group users
	   When I push button "Send letter"
       When I send message recipients
	   Then I see message "Letter is sent"
Scenario: Test mark letters with flags
	   When I mark three letters with flags
       Then I see letters with flags 
Scenario: Test unchecked letters with flags
       When I unchecked letters with flags
       Then I not see mark flag on letters