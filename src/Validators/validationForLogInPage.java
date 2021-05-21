package Validators;

public class validationForLogInPage {
  public static boolean UserName(String userIdName) throws Exception {
    if (userIdName != null) {
      return true;
    }
    throw new Exception("You did not sign in the user Name correctly!");
  }

  public static boolean passwordHolder(String userPassword) throws Exception {
    if (userPassword != null) {
      return true;
    }

    throw new Exception("You did not sign in the password correctly!");
  }
}
