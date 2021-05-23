package Validators;

import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exceptions.*;

public class Validations {

  public static boolean nameFirst(String name) throws Exception {
    if (isNotNull(name) && name.length() > 3) {
      return true;
    }

    throw new Exception("Please provide your first name properly.");
  }

  public static boolean nameLast(String name) throws Exception {
    if (isNotNull(name) && name.length() > 3) {
      return true;
    }

    throw new Exception("Please provide your last name properly.");
  }

  public static boolean nationalId(String idNo) throws Exception {
    if (isNotNull(idNo) && idNo.length() == 10) {
      return true;
    }

    throw new Exception("Please provide your nationalID properly.");
  }

  public static boolean gender(String symbol) throws Exception {
    if (isNotNull(symbol)) {
      return true;
    }

    throw new Exception("Please provide your gender properly.");
  }

  public static boolean email( String emailAddress) throws Exception{
    if (isNotNull(emailAddress)) {
     if( emailChecker(emailAddress) == true){
      return true;
     }
    }
    throw new Exception("Please provide your email properly.");
  }

  public static boolean phoneNumber(String number) throws Exception {
    if (isNotNull(number) && number.length() > 11) {
      if(numberChecker(number) == true){
      return true;
      }
    }
    throw new Exception("Please provide your phone number properly.");
  }

  public static boolean dateOfBirth(String  date) throws Exception {
    if (isNotNull(date)) {
      return true;
    }

    throw new Exception("Please provide your date of birth properly.");
  }

  public static boolean institutionName(String name) throws Exception {
    if (isNotNull(name)) {
      return true;
    }

    throw new Exception("Please provide the name of your institution properly.");
  }


  public static boolean isNotNull(String data) {
    return data != null;
  }

  public static boolean numberChecker(String data) {
    return data.charAt(0) == '0' &&
      data.charAt(1) == '1' &&
      data.charAt(2) == '5' ||
      data.charAt(2) == '6' ||
      data.charAt(2) == '7' ||
      data.charAt(2) == '8' ||
      data.charAt(2) == '9';
  }

  public static boolean emailChecker (String data){
    String emailRegex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$";
    Pattern emailPattern = Pattern.compile(emailRegex,Pattern.CASE_INSENSITIVE);
    Matcher matcher = emailPattern.matcher(data);
    return matcher.find();

  }

}