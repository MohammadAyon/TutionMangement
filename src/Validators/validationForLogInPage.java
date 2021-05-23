package Validators;

import Exceptions.NullExceptions;

public class validationForLogInPage {
  public static boolean UserName(String userIdName,String userPassword) throws Exception {
    if (isNull(userIdName)) {
      throw new NullExceptions("You did not sign in the user Name correctly!");
    }
    if (isNull(userPassword)) {
      throw new NullExceptions("You did not sign in the password correctly!");
    }
  return true;
  }

  
  public static <T> boolean isNull(T data) {
    return data != null;
  }
}
