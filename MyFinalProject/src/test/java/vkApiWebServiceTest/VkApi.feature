@vkTest
Feature: Test VKService

Scenario:Test positive send post
	When I post on wall
    Then Post added to the wall
Scenario:Test positive edit post
	When I edit post on wall
    Then I check changes after adapter   
Scenario:Test positive delete post
	When I delete post from the wall
    Then I check changes after adapter
    