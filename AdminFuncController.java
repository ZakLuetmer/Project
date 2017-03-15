package Project;
import java.util.*;
import Project.*;

/**
 * AdminFuncController
 * @authors: Nathan Hansen, Zak Luetmer, Colton Alseth, TJ Schmitz
 * @version 2/25/2017
 */
public class AdminFuncController {
  private DBController dbController;
  private UniversityController uController;
  private AccountController aController;
  
  /**
   * Constructor
   * 
   */
  public AdminFuncController(){
    dbController = new DBController();
    aController = new AccountController();
  }
  
  /**
   * An admin can create an account 
   *
   * @param user
   * 
   * @return true if added else return false
   */
  public String addAccount(String first, String last, String username, String password, char type){
    return dbController.addAccount(first,last,username,password,type);
  }
  
  /**
   * An Admin can add a new school to the list of schools in the DB
   * 
   * @return true if school is added else return false
   */
  public boolean addSchool(University school){
    return true;
  }
  
  /**
   *An Admin can edit a University from the BD 
   * 
   * @param name the name of the University
   * @param state the state the University is located int
   * @param location can be one of the following: SUBURBAN, URBAN, SMALL-CITY, or -1 if unknown
   * @param control can be one of the following: PRIVATE, STATE, CITY, or -1 if unknown
   * @param numStudents number of students enrolled in the University
   * @param perFemale percentage of enrolled students that are females (between 0 and 100)
   * @param satVerbal average SAT verbal score for enrolled students(between 0 and 800)
   * @param satMath average SAT math score for enrolled students(between 0 and 800)
   * @param expenses annual expenses or tuition to attend the school
   * @param perFA percentage of enrolled students receiving financial aid
   * @param numAppicants total number of applicants that apply to the school anually
   * @param perAdmitted percent of applicants that get admitted
   * @param perEnrolled percent of applicants that decide to enroll
   * @param academicScale integer between 1 and 5 indicating the academic scale of the University
   * @param socialScale integer between 1 and 5 indicating the quality of social life at the University
   * @param lifeScale integer between 1 and 5 indicating the quality of life at the University
   * @param emphases up to five areas of study the University excels at (all Strings)
   * 
   * @return true if school was successfully editted else return false
   */
  public boolean editUniversity(String name, String state, String location, String control, int numStudents,
                                double perFemale, int satVerbal, int satMath, int expenses, double perFA,
                                int numApplicants, double perAdmitted, double perEnrolled, int academicScale,
                                int socialScale, int lifeScale, ArrayList<String> emphases){
    return uController.editUniversity(name,state,location,control,numStudents,perFemale,satVerbal,satMath,
                                      expenses,perFA,numApplicants,perAdmitted,perEnrolled,academicScale,
                                      socialScale,lifeScale,emphases);
  }
  
  /**
   * The admin can view a list Users
   * 
   * @returns a set of accounts from the BD
   */
  public ArrayList viewUsers(){
    return dbController.getAllUsers();
  }
  
  /**
   *Displays the info of the account 
   * 
   * @param first the first name of the user
   * @param last the last name of the user
   * @param password the password of the user
   * @param type U for user, A for admin
   * @param status true if active, false if deactivated
   * @param account the Account object of the user
   * 
   * @return the details of the account
   */
  public String displayInfo(String first, String last, String username, String password, char type, boolean status){
    return null; 
  }
  
  /**
   * An Admin can edit an account.
   * 
   * @param first the first name of the user
   * @param last the last name of the user
   * @param password the password of the user
   * @param type U for user, A for admin
   * @param status true if active, false if deactivated
   * @param account the Account object of the user
   * 
   * @return true of the account was editted successifully else return false
   */
  public boolean editAccount(Account account, String first, String last, String password, char type, boolean status){
    return true; 
  }
  
  /**
   * a confirmation Message
   * 
   * @return a confirmation Message 
   */
  public String confirmationMessage(){
    return "Are you sure?"; 
  }
  
  /**
   * resets the field to their default settings 
   */
  public void resetFields(){
  }
  
  /**
   * A no name error
   * 
   * @return a noNameError 
   */
  public String noNameError(){
    return "No name was inputted. Please enter a name"; 
  }
  
  /**
   * displays the name of the University
   * 
   * @param name name of the University
   * 
   * @return name of the University
   */
  public String displayUnversity(String name){
    return name;
  }
  
  /**
   * An empty field error. 
   * 
   * @return please enter something 
   */
  public String emptyFieldError(){
    return "Please enter something";
  }
  
  /**
   * shows a list of Universities
   * 
   * @return a list of Universities
   */
  public ArrayList<String> viewUniversities(){
    return null; 
  }
  
}




