package DataClass;
import  Validators.*;

import java.util.Date;

public class person {
 private  String firstName;
 private String lastName;
 private String nationalId;
 private String gender;
 private String phoneNumber;
 private Date dateOfBirth;
 private String institutionName;
 private String emailAddress;

 
 public person(String firstName,String lastName,String nationalId,String gender,String phoneNumber,
               Date dateOfBirth,String institutionName,String emailAddress){
  this.firstName=firstName;
  this.lastName=lastName;
  this.nationalId=nationalId;
  this.gender=gender;
  this.phoneNumber=phoneNumber;
  this.dateOfBirth=dateOfBirth;
  this.institutionName=institutionName;
  this.emailAddress=emailAddress;
 }
 public String getFirstName(){
  return firstName;
 
 }
 public void setFirstName(String firstName) throws Exception {
  Validators.Validations.nameFirst(firstName);
   this.firstName=firstName;
 }
 public String getLastName(){
  return lastName;
 }

 public void setLastName(String lastName) throws Exception {
  Validators.Validations.nameLast(lastName);
   this.lastName=lastName;
 }

 public String getNationalId(){
  return nationalId;
 }

 public void setNationalId(String nationalId) throws Exception {
   Validators.Validations.nationalId(nationalId);
   this.nationalId=nationalId;
 }

public String getGender(){
  return gender;
}

public void setGender(String gender) throws Exception{
  Validators.Validations.gender(gender);
  this.gender=gender;
}

public String getPhoneNumber(){
  return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) throws Exception{
  Validators.Validations.phoneNumber(phoneNumber);
  this.phoneNumber=phoneNumber;
}

public Date getDateOfBirth(){
  return dateOfBirth;
}

public void setDateOfBirth(Date dateOfBirth) throws Exception {
  Validators.Validations.dateOfBirth(dateOfBirth);
   this.dateOfBirth=dateOfBirth;
}

public String getInstitutionName(){
  return  institutionName;
}

public void setInstitutionName(String institutionName) throws Exception {
  Validators.Validations.institutionName(institutionName);
   this.institutionName=institutionName;
}

public String getEmailAddress(){
  return  emailAddress;
}

public void setEmailAddress(String emailAddress) throws Exception {
  Validators.Validations.email(emailAddress);
   this.emailAddress=emailAddress;
}

public String toString(){
   return "person{"+"firstName='"+firstName+'\''+
            ",lastName='"+lastName+'\''+",nationalId='"+nationalId+'\''+",gender='"+gender+'\''+",phoneNummber='"+
            phoneNumber+'\''+",dateOfBirth='"+dateOfBirth+'\''+",institutionName='"+institutionName+'\''+",emailAddress='"+
            emailAddress+'\''+'}';
   
}


}

