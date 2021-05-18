package Exceptions;

public class InvalidPhoneNumberException extends Exception{
  public InvalidPhoneNumberException(){
    super();
  }
  public InvalidPhoneNumberException(String message){
    super(message);
  }
}
