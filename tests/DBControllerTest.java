package Project.tests;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import Project.*;

public class DBControllerTest {
	private UserUI userUI;
	private AdminUI adminUI;
	private LoginUI loginUI;
	private DBController dbcontroller;
	SearchController sController;
	  
	@Before
	public void init(){
		  userUI = new UserUI();
		  adminUI = new AdminUI();
		  loginUI = new LoginUI();
		  dbcontroller = new DBController();
		  sController = new SearchController();
		  
		  ArrayList<String> emphasis= new ArrayList<String>(); 
		  
		 // do we need these anymore?
		 // dbcontroller.editUniversity("_TESTSCHOOL", "MMIN", "URBAN", "PRIVATE", 100000, 50, 500, 500, 100000, 90, 10000, 98, 50, 1, 1, 1, emphasis);
		 // dbcontroller.editUniversity("_TESTSCHOOL1", "MMIN", "URBAN", "PRIVATE", 100001, 50, 500, 500, 100000, 90, 10000, 98, 50, 1, 1, 1, emphasis);
		 // dbcontroller.addUniversity("_TESTSCHOOL2", "MMIN", "URBAN", "PRIVATE", 100002, 50, 500, 500, 100000, 90, 10000, 98, 50, 1, 1, 1, emphasis);
		 // dbcontroller.addUniversity("_TESTSCHOOL3", "MMIN", "URBAN", "PRIVATE", 100003, 50, 500, 500, 100000, 90, 10000, 98, 50, 1, 1, 1, emphasis);
		 // dbcontroller.addUniversity("_TESTSCHOOL4", "MMIN", "URBAN", "PRIVATE", 100004, 50, 500, 500, 100000, 90, 10000, 98, 50, 1, 1, 1, emphasis);
		 // dbcontroller.addUniversity("_TESTSCHOOL5", "MMIN", "URBAN", "PRIVATE", 100005, 50, 500, 500, 100000, 90, 10000, 98, 50, 1, 1, 1, emphasis);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testIllegalArgumentExceptions(){
		dbcontroller.getAccount("SomethingThatWillNotbeAUserName");
		dbcontroller.getUniversity("ANameOfAUniversityThatWillNotBeInTheDatabase");
		dbcontroller.getUserSavedSchools("calseth");
		
	}
	
	@Test
	public void testGetAccount() {
		Account something = dbcontroller.getAccount("zakluetmer");
		String name = something.getFirstName();
		assertTrue(name.equals("Zak"));
	}

	@Test
	public void testGetUniversity() {
		assertTrue(dbcontroller.getUniversity("_TESTSCHOOL").getLocation().equals("URBAN"));
	}

	@Test
	public void testDisplayUniversity() {
		int something = 0;
		for(int i = 0 ; i <= dbcontroller.displayUniversity("ADELPHI").size();i++){		
					something++;
		}
		assertTrue(something > 6);
		assertTrue(dbcontroller.displayUniversity("ADELPHI").get(3).equals("PRIVATE"));
		assertTrue(dbcontroller.displayUniversity("ADELPHI").get(2).equals("-1"));
	}

//	@Test
//	public void testEditUniversity() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testAddUniversity() {
//		fail("Not yet implemented");
//	}

//	@Test
//	public void testSaveSchool() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testGetUserSavedSchools() {
		ArrayList<String> emptyUserListOfSchools = new ArrayList<String>();
		assertTrue(dbcontroller.getUserSavedSchools("zakluetmer").contains("QUEENS"));
	}

	@Test
	public void testGetAllUniversities() {
		ArrayList<String> testingSize = new ArrayList<String>();
		testingSize = dbcontroller.getAllUniversities();
		assertTrue(testingSize.size() > 50);
	}

//nathan	@Test
//	public void testSearch() {
//		fail("Not yet implemented");
//	}

//TJ	@Test
	//public void testIsWithinRange() {
//		fail("Not yet implemented");
//	}

//zak	@Test
	//public void testRemoveSchool() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testIsSchoolSaved() {
		assertTrue(dbcontroller.isSchoolSaved("ADELPHI"));
		assertTrue(dbcontroller.isSchoolSaved("asdfasdfsfasfasd")== false);
	}

	@Test
	public void testGetAllUsers() {
		String[][] testing = dbcontroller.getAllUsers();
		assertTrue(testing.length >= 6);
	}

//zak	@Test
//	public void testAddAccount() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testIsUsernameTaken() {
		assertTrue(dbcontroller.isUsernameTaken("zakluetmer") == true);
		assertTrue(dbcontroller.isUsernameTaken("AUserNameThatNoOneWillHave") == false);
	}

//colton	@Test
//	public void testEditAccount() {
//		fail("Not yet implemented");
//	}

	@Test
	public void testIsDeactivated() {
		assertTrue(dbcontroller.isDeactivated("zakluetmer") == false);
		assertTrue(dbcontroller.isDeactivated("luser"));
	}

//tj	@Test
//	public void testDeactivateUser() {
//		fail("Not yet implemented");
//	}

	@Test //get from search controller
	public void testFindRecommendations() {
		
			ArrayList<String> listRecs = dbcontroller.findRecommendations("_TESTSCHOOL");
			
			assertTrue("The first reccomended school for _TESTSCHOOL is '_TESTSCHOOL1'",  listRecs.get(0).equals("_TESTSCHOOL1"));
			assertTrue("The second reccomended school for _TESTSCHOOL is '_TESTSCHOOL2'", listRecs.get(1).equals("_TESTSCHOOL2"));
			assertTrue("The third reccomended school for _TESTSCHOOL is '_TESTSCHOOL3'",  listRecs.get(2).equals("_TESTSCHOOL3"));
			assertTrue("The fourth reccomended school for _TESTSCHOOL is '_TESTSCHOOL4'", listRecs.get(3).equals("_TESTSCHOOL4"));
			assertTrue("The fifth reccomended school for _TESTSCHOOL is '_TESTSCHOOL5'",  listRecs.get(4).equals("_TESTSCHOOL5"));
		
	}

}
