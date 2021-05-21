package Functionalities;

public class person {
 private  String firstName;
 private String lastName;
 private String nationalId;
 private String gender;
 private String phoneNumber;
 private int dateOfBirth;
 private String institutionName;
 private String emailAddress;

 
 public person(String firstName,String lastName,String nationalId,String gender,String phoneNumber,
               int dateOfBirth,String institutionName,String emailAddress){
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
public int getDateOfBirth(){
  return dateOfBirth;
}
public void setDateOfBirth(int dateOfBirth){
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
public String toString(){
   return "person{"+"firstName='"+firstName+'\''+
            ",lastName='"+lastName+'\''+",nationalId='"+nationalId+'\''+",gender='"+gender+'\''+",phoneNummber='"+
            phoneNumber+'\''+",dateOfBirth='"+dateOfBirth+'\''+",institutionName='"+institutionName+'\''+",emailAddress='"+
            emailAddress+'\''+'}';
   
}


}

