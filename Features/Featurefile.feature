Feature: Login functionality of Facebook 
Scenario: Verification of valid login  
Given Open the chrome and launch the application			
When Enter the Username and Password			
Then click the login

Scenario: Logout from the application  		
When Logout from the application			
Then check the page title

Scenario: Loginwith invalid username  		
#Given Open the chrome and launch the application			
When Enter the invalid Username and Password			
Then click the login and chect the page title
Then click the login