package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class TeacherWindowController {
  
  @FXML
  private TextField FirstName;
  
  @FXML
  private TextField LastNameTextField;
  
  @FXML
  private DatePicker DateOfBirthField;
  
  @FXML
  private TextField PhoneNuberField;
  
  @FXML
  private TextField EmailFiled;
  
  @FXML
  private TextField NationalIdField;
  
  @FXML
  private ComboBox<?> GenderFIeld;
  
  @FXML
  private ImageView ImageViewerField;
  
  @FXML
  private Button ChoosePhotoButton;
  
  @FXML
  void handelChoosphotoevent(ActionEvent event) {
    FileChooser fileChooser=new FileChooser();
    Stage primaryStage=(Stage) this.ChoosePhotoButton.getScene().getWindow();
    File selectedFile=fileChooser.showOpenDialog(primaryStage);
    if(selectedFile!=null){
      String selectedFilePath= selectedFile.toURI().getPath();
      System.out.println(selectedFilePath);
    }
    System.out.println("Save");
  }
  
}