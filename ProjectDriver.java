package Project;
import java.util.*;

import Project.*;

public class ProjectDriver {
 private UserUI userUI;
 private AdminUI adminUI;
 private LoginUI loginUI;
 
 public ProjectDriver(){
  userUI = new UserUI();
  adminUI = new AdminUI();
  loginUI = new LoginUI();
    
 }
 
 public void run(){
  //Adds 3 Accounts
  adminUI.addAccount("Zak", "Luetmer", "zakluetmer", "password", 'u');
  adminUI.addAccount("Nathan", "Hansen", "nhansen", "password", 'a');
  adminUI.addAccount("Colton","Alseth","calseth","password",'a');
    
  System.out.println("PROJECT DRIVER");
  System.out.println("");
  System.out.println("Adds Accounts");
  System.out.println("");
  
  //Checks if the added accounts are in the database and checks for errors. 
  
  System.out.println("This tests U11: Adds 'zakluetmer','nrhansen', and 'calseth' to the database: "+Arrays.deepToString(adminUI.viewUsers()));
  System.out.println("This tests U11 if the account is already added: Should return 'username taken' error: " + adminUI.addAccount("Taken","User","zakluetmer","password",'u'));
  System.out.println("This tests U11 more information is needed: Should return 'Fill in all information' error: " +adminUI.addAccount("Not","Complete","","",'u'));
  System.out.println("");
  
  //Checks for a successful deactivation and deactivation error
  
  System.out.println("Deactivation");
  System.out.println("");
  System.out.println("This tests U13 Deactivate user : Colton Alseth should be deactivated" + Arrays.deepToString(adminUI.viewUsers()));
  System.out.println("This tests U13 the user is already deactivated : Should return 'account already deactivated' error: " + adminUI.deactivateUser("calseth"));
  System.out.println("");
  
  //Tests login and errors involving the login process
  
  System.out.println("Login and Login Errors");
  System.out.println("");
  System.out.println("U1 Logon, account is deactivated : Should return 'User deactivated' error: "+loginUI.Login("calseth", "password"));
  System.out.println("U1 Logon, wrong logon information : Should return 'Wrong login info' error: "+loginUI.Login("wrong", "info"));
  System.out.println("U1 Logon, successful logon : Should return 'Successful login': " + loginUI.Login("zakluetmer", "password"));
  System.out.println("");
  
  //Checks if editing an account works and checks for errors
  
  System.out.println("Edits Account");
  System.out.println("");
  adminUI.editAccount("NotColton","Alseth","calseth","password",'a','n');
  System.out.println("U12 Edit Account, tests if an admin can edit a account : Should change Colton's name to 'NotColton': "+ Arrays.deepToString(adminUI.viewUsers()));
  System.out.println("Should return an empty field error: " +adminUI.editAccount("Colton","Alseth","calseth","",'a','n'));
  System.out.println("");
  
  //Checks the display information method
  
  System.out.println("Displays User Information");
  System.out.println("");
  System.out.println("U10 View account, tests to see if the admin can view someone's account : Should display Zak's info: " + adminUI.displayInfo("zakluetmer")); 
  System.out.println("");
  
  //Creates school "SJU"
  
  System.out.println("Creates Universities");
  System.out.println("");
  ArrayList<String> emphasis = new ArrayList<String>();
  emphasis.add("Science");
  emphasis.add("Math");
  System.out.println("U15, checks if you can add the same school. Also adds it if its not there: depends on if the program has been run before: "+ adminUI.addUniversity("CSB", "Minnesota", "RURAL", "PRIVATE", 4000, 50.0, 500, 500, 50000, 91.0, 2000, 65.0, 50.0, 4, 4, 1,emphasis));
  System.out.println("Should return a missing name error: "+ adminUI.addUniversity("", "Minnesota", "RURAL", "PRIVATE", 4000, 50.0, 500, 500, 50000, 91.0, 2000, 65.0, 50.0, 4, 4, 1,emphasis));
  System.out.println("Should return 'aready saved' error: "+adminUI.addUniversity("QUEENS", "Minnesota", "RURAL", "PRIVATE", 4000, 50.0, 500, 500, 50000, 91.0, 2000, 65.0, 50.0, 4, 4,0, emphasis));
  System.out.println("");
  
  //Edits SJU
  
  System.out.println("Edit University");
  System.out.println("");
     adminUI.editUniversity("SJU", "Minnesota", "URBAN", "PRIVATE", 4000, 50.0, 500, 500, 50000, 91.0, 2000, 65.0, 50.0, 4, 4, 1,emphasis);
     System.out.println("U16 edit schools. Should change SJU from 'RURAL' to 'URBAN': " + adminUI.displayUniversity("SJU"));
     System.out.println("");
     
  //Displays all universities including the newly added SJU
  
     System.out.println("Displays All Universities");
     System.out.println("");
  System.out.println("U14, shows the admin the entire list of schools : Displays universities: " + adminUI.viewUniversities());
  System.out.println("");

  //Saves Queens and Adelphi to user's list, output changes depending on if the program has been run before and views saved schools
  
  System.out.println("Save Universities");
  System.out.println("");
  System.out.println("Output depends on if the program has been run before: "+userUI.saveSchool("zakluetmer","QUEENS"));
  System.out.println("U7 save school, saves a school to the user : Output depends on if the program has been run before: "+userUI.saveSchool("zakluetmer","ADELPHI"));
  System.out.println("U6 view schools, view a list of schools the user has saved : Should return that ADELPHI and QUEENS has been saved by Zak: "+userUI.viewSavedSchools("zakluetmer"));
  System.out.println("");
  
  //Removes school from user's list
  
  System.out.println("Removes University From User List");
  System.out.println("");
  userUI.removeSchool("zakluetmer", "ADELPHI");
  System.out.println("U9 U3 , removes a school from the user's list : Should return that Adelphi has been removed: "+userUI.viewSavedSchools("zakluetmer"));
  System.out.println("");
  
  //Displays CSB specifically
  System.out.println("Display Specific University");
  System.out.println("Should return CSB's information: " + adminUI.displayUniversity("CSB"));
  System.out.println("");
  
  //Searches for "College" using the search function and views results
  System.out.println("Search Function");
  System.out.println("");
  System.out.println("U2 Search for schools, The user searches for a school : U4 dispalys the result of the search : Should return all schools with 'College' in their name: " + userUI.search("College", "", "", "", 0, 0, 0.0, 0.0, 0, 0, 0, 0, 0, 0, 0.0, 0.0, 0, 0, 0.0, 0.0, 0.0, 0.0, 0, 0, 0, 0, 0, 0, null));
  System.out.println("");
  
  //Finds recommendations for QUEENS
  System.out.println("Recommended School Function");
  System.out.println("");
  System.out.println("Returns five recommended schools similar to 'QUEENS': " + userUI.findRecommendations("CSB"));
 
 }
 
 
 public static void main (String args[]){
  ProjectDriver driver = new ProjectDriver();
  driver.run();
 }
}
