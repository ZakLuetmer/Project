import java.util.*;
import Project230.*;

/**
 * UserUI
 * @authors: Nathan Hansen, Zak Luetmer, Colton Alseth, TJ Schmitz
 * @version 2/25/2017
 */
public class UserUI{
  
  /**
   * UserUI constructor
   */
  public UserUI(){
    
  }
  
  /**
   * View school information
   *
   * @param University object school
   * 
   * @return the schools info
   */
  public University viewSchoolInfo(University school){
    return school;
  }
  
  /**
   * save the school to the user                                      
   *
   * @param University object school
   */
  public void saveSchool(University school){
    
  }
  
  /**
   * remove school from the users list 
   */
  public void removeSchool(){
    
  }
  
  /**
   * view a list of univerities the user has saved
   *
   * @param University object school
   * 
   * @return school
   */
  public Set<String> viewSavedSchools(University school){
    return null;
  }
  
  /**
   * An admin can create an account 
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
   */
  public void search(String name, String state, String location, String control, int numStudents,
                     double perFemale, int satVerbal, int satMath, int expenses, double perFA,
                     int numApplicants, double perAdmitted, double perEnrolled, int academicScale,
                     int socialScale, int lifeScale, ArrayList<String> emphases){
    
  }
  
  /**
   * displays results
   *
   * @param a set of string called list
   * 
   * @return list
   */
  public String displayResults(Set<String> list){
    return "";
  }
  
  /**
   * show univserities
   *
   * @param University object school
   * 
   * @return the school
   */
  public String showSchools(University school){
    return ""; 
  }
  
  /**
   * The user can edit their acccount
   * 
   * @return true if they made any changes else return false
   */
  public boolean editAccount(){
    return false; 
  }
  
  /**
   * confirmation message
   * 
   * @return a comfirmation message
   */
  public String confirm(){
    return "confirm"; 
  }
  
  /**
   *  display University
   *
   *@param University object school
   * 
   * @return 
   */
  public String displayUniversity(University school){
    return ""; 
  }
  
  /**
   * Already saved error message when the user tries to save the same school twice
   * 
   * @return "Universities already saved"
   */
  public String alreadySavedError(){
    return "already saved Error"; 
  }
  
  /**
   * Is the user sure they want to make those changes? confirmation message
   * 
   * @return a confirmation message
   */
  public String confirmationMessage(){
    return "confirmation Message"; 
  }
  
  /**
   *confirmation message to change
   */
  public String confirmChange(){
    return "are you sure?"; 
  }
}