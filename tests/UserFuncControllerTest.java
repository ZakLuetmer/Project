package Project.tests;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import Project.*;


public class UserFuncControllerTest {
 private UserUI userUI;
 private AdminUI adminUI;
 private LoginUI loginUI;
 private DBController dbcontroller;
  private UserFuncController uFuncController;
 private ArrayList<String> temp;
   
 @Before
 public void init(){
    userUI = new UserUI();
    adminUI = new AdminUI();
    loginUI = new LoginUI();
    dbcontroller = new DBController();
    adminUI.addAccount("Bill",  "Smith", "bsmith", "1234567890", 'u');
    ArrayList<String> temp = new ArrayList<String>();
 }
 
 //@Test
 //public void testUserFuncController() {
 // fail("Not yet implemented");
 //}

 @Test
 public void testEditUser()
 {
   assertTrue("Account cannot have a blank 'username' field", 
              dbcontroller.editAccount("Zak", "Luetmer", "","password",'u','Y').equals("Missing username, password, or type"));
   assertTrue("Account cannot have a blank 'password' field", 
              dbcontroller.editAccount("Zak", "Luetmer", "zakluetmer","",'u','Y').equals("Missing username, password, or type"));
   assertTrue("Account cannot have a blank 'type' field", 
              dbcontroller.editAccount("Zak", "Luetmer", "zakluetmer","password",' ','Y').equals("Missing username, password, or type"));
   assertTrue("Account's password was changed succesfully", 
              dbcontroller.editAccount("Zak", "Luetmer", "zakluetmer","password1",'u','Y').equals("Edit Successful!"));
   assertTrue("Account's first name was changed succesfully", 
              dbcontroller.editAccount("Zak", "Luetmer", "zakluetmer","password",'u','Y').equals("Edit Successful!"));
   assertTrue("Account's last name was changed succesfully", 
              dbcontroller.editAccount("Zak", "Litmer", "zakluetmer","password",'u','Y').equals("Edit Successful!"));
 }

 @Test
 public void testRemoveSchool() {
  dbcontroller.saveSchool("zakluetmer", "QUEENS");
  dbcontroller.removeSchool("zakluetmer", "QUEENS");
  ArrayList<String> temp = dbcontroller.getUserSavedSchools("zakluetmer");
  assertFalse(dbcontroller.isSchoolSaved("QUEENS"));
 }

 //@Test
 //public void testSaveSchool() {
 // fail("Not yet implemented");
 //}

}
