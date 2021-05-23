package Validators;

import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Exceptions.*;

import javax.naming.InvalidNameException;

public class Validations {

  public static boolean isValidData(String Firstname, String LastName, LocalDate date,
                                    String number, String EmailID, String NID, String Gender, String InistituionName,String imagePath) throws Exception {
    if (!isNotNull(Firstname) && Firstname.length() > 3) {
      throw new InvalidNameException("Please provide your first name properly.");
    }

  
    if (!isNotNull(LastName) && LastName.length() > 3) {
      throw new InvalidNameException("Please provide your last name properly.");
    }

 
    if (!isNotNull(NID) && NID.length() == 10) {
      throw new InvalidNidExceptions("Please provide your nationalID properly.");
    }

    if (!isNotNull(Gender)) {
      throw new Exception("Please provide your gender properly.");
    }
    if (!isNotNull(EmailID)) {
     if(emailChecker(EmailID)){
       throw new InvalidEmailAddressException("Please provide your email properly.");
     }
    }
   
    if (!isNotNull(number) && number.length() > 11) {
      if(numberChecker(number) == true){
        throw new InvalidPhoneNumberException("Please provide your phone number properly.");
      }
    }

    if (!isNotNull(String.valueOf(date))) {
      throw new InvalidDateException("Please provide your date of birth properly.");
    }
    
    if (!isNotNull(InistituionName)) {
      throw new Exception("Please provide the name of your institution properly.");
    }
    if (!isNotNull(imagePath)) {
      throw new Exception("Invalid path to picture. Maybe you didn't select a path?");
    }
   return true;
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