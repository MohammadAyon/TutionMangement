package Utilities;

import DataClass.person;


import java.io.*;
import java.lang.String;

import java.util.ArrayList;


public class serialization {
  public static boolean serialized(String pathToFile, ArrayList<person.tutor>listOftutor){
    File file=new File(pathToFile);
    FileOutputStream fileOutputStream;
    ObjectOutputStream objectOutputStream;
    try {
      fileOutputStream = new FileOutputStream(pathToFile);
      objectOutputStream = new ObjectOutputStream(fileOutputStream);
      objectOutputStream.writeObject(listOftutor);
      return true;
    }catch (Exception exception){
      return false;
    }
  }
  public static ArrayList<person.tutor>deserialize(String pathToFile){
    File file=new File(pathToFile);
    ArrayList<person.tutor> listOftutor=null;
    FileInputStream fileInputStream=null;
    ObjectInputStream objectInputStream=null;
    try {
      fileInputStream=new FileInputStream(file);
      objectInputStream=new  ObjectInputStream(fileInputStream);
      listOftutor=(ArrayList<person.tutor>) objectInputStream.readObject();
    }
    catch (Exception exception){
      System.err.println(exception.getMessage());
    }
    return listOftutor;
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}
  