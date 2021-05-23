package DataClass;

import java.util.Date;

public class person {
  private String UserName;
  private String Password;
 private  String firstName;
 private String lastName;
 private String nationalId;
 private String gender;
 private String phoneNumber;
 private Date dateOfBirth;
 private String institutionName;
 private String emailAddress;
  
  public person(String userName, String password) {
    UserName = userName;
    Password = password;
  }
  
  public person(String firstName, String lastName, String nationalId, String gender, String phoneNumber,
                Date dateOfBirth, String institutionName, String emailAddress){
  this.firstName=firstName;
  this.lastName=lastName;
  this.nationalId=nationalId;
  this.gender=gender;
  this.phoneNumber=phoneNumber;
  this.dateOfBirth=dateOfBirth;
  this.institutionName=institutionName;
  this.emailAddress=emailAddress;
 }
  
  public String getUserName() {
    return UserName;
  }
  
  public void setUserName(String userName) {
    UserName = userName;
  }
  
  public String getPassword() {
    return Password;
  }
  
  public void setPassword(String password) {
    Password = password;
  }
  
  public String getFirstName(){
  return firstName;
 
 }
 public void setFirstName(String firstName){
  this.firstName=firstName;
 }
 public String getLastName(){
  return lastName;
 }
 public void setLastName(String lastName){
  this.lastName=lastName;
 }
 public String getNationalId(){
  return nationalId;
 }
 public void setNationalId(String nationalId){
  this.nationalId=nationalId;
 }
public String getGender(){
  return gender;
}
public void setGender(String gender){
  this.gender=gender;
}
public String getPhoneNumber(){
  return phoneNumber;
}
public void setPhoneNumber(String phoneNumber){
  this.phoneNumber=phoneNumber;
}
public Date getDateOfBirth(){
  return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth){
  this.dateOfBirth=dateOfBirth;
}
public String getInstitutionName(){
  return  institutionName;
}
public void setInstitutionName(String institutionName){
  this.institutionName=institutionName;
}
public String getEmailAddress(){
  return  emailAddress;
}
public void setEmailAddress(String emailAddress){
  this.emailAddress=emailAddress;
}
  
  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder("person{");
    sb.append("firstName='").append(firstName).append('\'');
    sb.append(", lastName='").append(lastName).append('\'');
    sb.append(", nationalId='").append(nationalId).append('\'');
    sb.append(", gender='").append(gender).append('\'');
    sb.append(", phoneNumber='").append(phoneNumber).append('\'');
    sb.append(", dateOfBirth=").append(dateOfBirth);
    sb.append(", institutionName='").append(institutionName).append('\'');
    sb.append(", emailAddress='").append(emailAddress).append('\'');
    sb.append('}');
    return sb.toString();
  }
}

