
package Application;

import DataClass.tutor;
import Utilities.*;
import Utilities.DateConverter;
import Utilities.serialization;
import Validators.Validations;
import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class TeacherWindowController {
  
  @FXML // fx:id="FirstName"
  private TextField FirstName; // Value injected by FXMLLoader
  
  @FXML // fx:id="LastNameTextField"
  private TextField LastNameTextField; // Value injected by FXMLLoader
  
  @FXML // fx:id="DateOfBirthField"
  private DatePicker DateOfBirthField; // Value injected by FXMLLoader
  
  @FXML // fx:id="PhoneNuberField"
  private TextField PhoneNuberField; // Value injected by FXMLLoader
  
  @FXML // fx:id="EmailFiled"
  private TextField EmailFiled; // Value injected by FXMLLoader
  
  @FXML // fx:id="NationalIdField"
  private TextField NationalIdField; // Value injected by FXMLLoader
  
  @FXML // fx:id="GenderFIeld"
  private ComboBox<?> GenderFIeld; // Value injected by FXMLLoader
  
  @FXML // fx:id="ImageViewerField"
  private ImageView ImageViewerField; // Value injected by FXMLLoader
  
  @FXML // fx:id="ChoosePhotoButton"
  private Button ChoosePhotoButton; // Value injected by FXMLLoader
  @FXML // fx:id="IinistutionName"
  private Label IinistutionName; // Value injected by FXMLLoader
  
  @FXML // fx:id="InistutionField"
  private TextField InistutionField; // Value injected by FXMLLoader
  @FXML // fx:id="TutorListView"
  private ListView<tutor> TutorListView; // Value injected by FXMLLoader
  
  @FXML // fx:id="editSelectedButton"
  private Button editSelectedButton; // Value injected by FXMLLoader
  
  @FXML // fx:id="viewDetailsButton"
  private Button viewDetailsButton; // Value injected by FXMLLoader
  
  @FXML // fx:id="deleteButton"
  private Button deleteButton; // Value injected by FXMLLoader
  
  @FXML // fx:id="SaveButton"
  private Button SaveButton; // Value injected by FXMLLoader
  
  @FXML // fx:id="ClearButton"
  private Button ClearButton; // Value injected by FXMLLoader
  private String selectedPath;
  private ArrayList<tutor> tutorList;
  private ObservableList<tutor>TutorObservableList;
  private  int chosenStudentIndex=-1;
  
  @FXML
  void handelChoosphotoevent(ActionEvent event) {
      FileChooser fileChooser=new FileChooser();
  Stage primaryStage=(Stage) this.ChoosePhotoButton.getScene().getWindow();
  File selectedFile=fileChooser.showOpenDialog(primaryStage);
    if(selectedFile!=null){
      this.selectedPath= selectedFile.toURI().getPath();
      System.out.println(this.selectedPath);
      }
      System.out.println("Save");
    
  }
  
  @FXML
  void handelClearButtonevent(ActionEvent event) {
  this.resetUI();
  }
  
  @FXML
  void handelSaveButtonevent(ActionEvent event) {
  String name=this.FirstName.getText();
  String Lastname=this.LastNameTextField.getText();
    LocalDate DateOfBirth=this.DateOfBirthField.getValue();
    String phoneNUmber=this.PhoneNuberField.getText();
    String EmailId=this.EmailFiled.getText();
    String NID=this.NationalIdField.getText();
    String ImagePath=this.selectedPath;
    String UniversityName=this.IinistutionName.getText();
    
      try {
        boolean validDate= Validations.isValidData(name,Lastname,DateOfBirth,phoneNUmber,EmailId,NID,"Male",UniversityName,ImagePath);
        Date DateCHange= DateConverter.convertLocalDateToDate(DateOfBirth);
        tutor Tutor=new tutor(name,Lastname,NID,"MAle",phoneNUmber,DateCHange,UniversityName,EmailId,ImagePath);
        if (this.chosenStudentIndex == -1) {
          this.tutorList.add(Tutor);
          this.TutorObservableList.add(Tutor);
        } else {
          this.tutorList.set(chosenStudentIndex, Tutor);
          this.TutorObservableList.set(chosenStudentIndex, Tutor);
        }
  
        this.TutorListView.refresh();
      } catch (Exception e) {
        e.printStackTrace();
      }
    
  }
  private void resetUI(){
    this.FirstName.setText("");
    this.LastNameTextField.setText("");
    this.DateOfBirthField.setValue(null);
    this.PhoneNuberField.setText("");
    this.EmailFiled.setText("");
    this.NationalIdField.setText("");
    this.selectedPath=null;
    this.IinistutionName.setText("");
    
  }
  @FXML
  void handleDeleteButtonClicked(ActionEvent event) {
  
  }
  
  @FXML
  void handleEditSelectedButtonClicked(ActionEvent event) {
  
  }
  
  @FXML
  void handleListViewClicked(MouseEvent event) {
  
  }
  
  @FXML
  void handleViewDetailsButtonClicked(ActionEvent event) {
  
  }
  @FXML
  public void initialize(){
    this.tutorList= serialization.deserialize(serialization);
  }
  
}
