Feature: Test login page

   Scenario: Test positive login page
    Given I am on main application page
     When I login as correct user
     Then I see logout link
	 
	 Scenario: Test send letter for group users
	 Given I am on main application page
       When I login as correct user
	   When I open page
       When I send message to User Group
	   Then I see message "Letter is sent"
    

  