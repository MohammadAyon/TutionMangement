package Validators;

//import Exceptions.NullExceptions;

//import Exceptions.NullExceptions;
public class validationForLogInPage {
  public static boolean UserName(String userIdName,String userPassword) throws Exception {
    if (!isNull(userIdName)||!isNull(userPassword)) {
      
        throw  new Exception("You did not sign in the user Name correctly!");
      }
    
      return true;
    }
  
  public static boolean isNull(String  data) {
    return data != null;
  }
}
