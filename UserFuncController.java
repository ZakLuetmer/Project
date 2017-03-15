package Project;
import java.util.*;
import Project.*;

/**
 * A class that runs the options that the user can select
 * @author Zak Luetmer, TJ Schmitz, Nathan Hansen, Colton Alseth
 * @version 2/22/17
 */

public class UserFuncController{
  
  public UserFuncController()
  {
    
  }
  
  /**
   * Edits the user with the given information
   * @param first:the user's first name
   * @param last: the user's last name
   * @param password: the user's password
   * @return true if the user was edited
   */
  
  public boolean editUser(String first, String last, String password)
  {
    return false; 
  }
  
  /**
   * Lets the user view their saved schools
   * @return the set of saved schools
   */
  
  public Set<String> viewSchools()
  {
    return null; 
  }
  
  /**
   * Removes a university from the student's saved schools
   * @param school: the university being removed
   * @return true if university was removed
   */
  
  public boolean removeSchool(University school)
  {
    return false; 
  }
  
  /**
   * Saves the selected university to the user's list of universities
   * @param school: the university being saved
   * @return true if university was saved
   */
  
  public boolean saveSchool(University school)
  {
    return false; 
  }
  
  /**
   * Shows the specific school that is selected
   * @param school: the university being shown
   * @return the school as a set
   */
  
  public Set<String> showSchool(University school)
  {
    return null; 
  }
  
  /**
   * Lets the user confirm their selection
   * @return error message
   */
  
  public String confirm()
  {
    return "Are you sure?";
  }
  
  /**
   * Gives the user an error if they try saving an already saved school
   * @return error message
   */
  
  public String AlreadySavedError()
  {
    return "School was already saved"; 
  }
}