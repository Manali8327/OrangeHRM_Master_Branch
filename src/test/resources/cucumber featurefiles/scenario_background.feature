Feature: Create_PIM

 Background: User is Logged In 
 Given user is on login page
 When  Verify that user can able to login with valid "Admin" and "admin123"
 Then Verify the title of the page 
 
 Scenario: get the list of main menu
 When verify the list of menu and hover on it one by one
 
 Scenario: create the pim
 When Pim creation
 And Give fname lname and mname and id
 And after click on save  button name of employee should be as per details filled

