package Exceptions;

public class InvalidEmailAddressException extends Exception {
  public InvalidEmailAddressException(){
    super();
  }
  public InvalidEmailAddressException(String message){
    super(message);
  }
  
}
