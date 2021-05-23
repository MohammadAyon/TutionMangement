package Application;
import DataClass.person;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


import java.awt.event.ActionEvent;
import java.io.File;
import java.util.ArrayList;


public class TeacherWindowController {
  private Button chooseProfilePicButton;
  private Button saveButton;
  private Button clearButton;
  private ListView<person> personListView;
  private String profilePhotoPath=null;
  private ArrayList<person> personArrayList=null;
  private ObservableList<person> personObservableList=null;
  @FXML
  public void handleChooseProfileButtonClick(ActionEvent event) {
    FileChooser fileChooser = new FileChooser();
    Stage primaryStage = (Stage) this.chooseProfilePicButton.getScene().getWindow();
    File selectedFile = fileChooser.showOpenDialog(primaryStage);
    if (selectedFile != null) {
      
      String selectedFilePath = selectedFile.toURI().getPath();
      this.profilePhotoPath=selectedFilePath;
      System.out.println(selectedFilePath);
    }
  }
  @FXML
  public void handleSaveButtonClicked(ActionEvent event){
    String pathToProfilePhoto=this.profilePhotoPath;
   //try {
     //boolean successful= DataValidator.isValidDate(pathToProfilePhoto);
   //}
  }
  private void resetUI(){
    this.profilePhotoPath=null;
  }
  @FXML
  public void handleClearFormButtonClick(ActionEvent event){
  this.profilePhotoPath=null;
  }
@FXML
  public void initialize(){
    this.personArrayList=new ArrayList<>();
    this.personObservableList= FXCollections.observableArrayList(personArrayList);
    this.personListView.setItems(personObservableList);
    System.out.println("Starting the application");
}
}
