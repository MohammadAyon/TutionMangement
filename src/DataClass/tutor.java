package DataClass;



import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

public class tutor extends person implements Serializable {
  private  String Academy;
  public tutor(String firstName, String lastName, String nationalId, String gender, String phoneNumber, Date dateOfBirth, String institutionName, String emailAddress,String Academy) {
    super(firstName, lastName, nationalId, gender, phoneNumber, dateOfBirth, institutionName, emailAddress);
    this.Academy=Academy;
  }
  
  public String getAcademy() {
    return Academy;
  }
  
  public void setAcademy(String academy) {
    Academy = academy;
  }
  
  @Override
  public String getFirstName() {
    return super.getFirstName();
  }
  
  @Override
  public void setFirstName(String firstName) {
    super.setFirstName(firstName);
  }
  @Override
  public String getLastName() {
    return super.getLastName();
  }
  
  @Override
  public void setLastName(String lastName) {
    super.setLastName(lastName);
  }
  
  @Override
  public String getNationalId() {
    return super.getNationalId();
  }
  
  @Override
  public void setNationalId(String nationalId) {
    super.setNationalId(nationalId);
  }
  
  @Override
  public String getGender() {
    return super.getGender();
  }
  
  @Override
  public void setGender(String gender) {
    super.setGender(gender);
  }
  
  @Override
  public String getPhoneNumber() {
    return super.getPhoneNumber();
  }
  
  @Override
  public void setPhoneNumber(String phoneNumber) {
    super.setPhoneNumber(phoneNumber);
  }
  
  @Override
  public Date getDateOfBirth() {
    return super.getDateOfBirth();
  }
  
  @Override
  public void setDateOfBirth(Date dateOfBirth) {
    super.setDateOfBirth(dateOfBirth);
  }
  
  @Override
  public String getInstitutionName() {
    return super.getInstitutionName();
  }
  
  @Override
  public void setInstitutionName(String institutionName) {
    super.setInstitutionName(institutionName);
  }
  
  @Override
  public String getEmailAddress() {
    return super.getEmailAddress();
  }
  
  @Override
  public void setEmailAddress(String emailAddress) {
    super.setEmailAddress(emailAddress);
  }
  
  @Override
  public String toString() {
    return "Tutors{}"+getEmailAddress();
  }
}


