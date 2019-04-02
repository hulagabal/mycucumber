Feature: login into Facebook 
Scenario Outline: login into facebook with valid username and password 
	Given valid user details 
	When facebook "<login>" and "<password>" opened 
	Then login suceessfull 
	
	Examples: 
		| login | password | 
		| hulagabal@gmail.com | 8970711727 | 
		| hulagabal@gmail.com | 8970711727 |
		
   