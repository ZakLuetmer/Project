import java.util.*;
import Project230.*;

/**
 * Gives the admin the ability to add universities to the database and edit any university
 * @author Zak Luetmer, TJ Schmitz, Nathan Hansen, Colton Alseth
 * @version 2/22/17
 */
public class UniversityController{
 
  public UniversityController(){
    
    
  }
  /**
   * Lets the admin add a university with the given information
   *@param name the name of the University
   * @param state the state the University is located int
   * @param loc can be one of the following: SUBURBAN, URBAN, SMALL-CITY, or -1 if unknown
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
   * @param l;ifeScale integer between 1 and 5 indicating the quality of life at the University
   * @param emphases up to five areas of study the University excels at (all Strings)
   * @return true if the university was added
   */
  public boolean addUniversity(String name, String state, String loc, String control, int numStudents,
                               double perFemale, int satVerbal, int satMath, int expenses, double perFA,
                               int numApplicants, double perAdmitted, double perEnrolled, int academicScale,
                               int socialScale, int lifeScale, ArrayList<String> emphases)
  {
    return false;
  }
  /**
   * Lets the admin edit the given university
   * @param school: the university that will be edited
   * @return true if the universiy was successfully edited 
   */
  public boolean editUniversity(University school)
  {
   return false; 
  }
  /**
   * Sends a confirmation message to the user
   * @return confirmation message
   */
  public String confirmationMessage()
  {
    return "Are you sure? ";
  }
  
}