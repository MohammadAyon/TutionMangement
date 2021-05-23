package Validators;

//import Exceptions.NullExceptions;

//import Exceptions.NullExceptions;
public class validationForLogInPage {
  public static boolean LogInPage(String userIdName,String userPassword) throws Exception {
    if (isNotNull(userIdName)||isNotNull(userPassword)) {

      return true;
      }
    
      throw  new Exception("You did not sign in correctly!");
    }
  
  public static boolean isNotNull(String  data) {
    return data != null;
  }
}