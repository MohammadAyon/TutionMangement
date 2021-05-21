package AllControlers;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
public class AdminDashBoardController {
  
  @FXML
  private Label setdatalabel;
  
  
  @FXML
  private Button StudentButton;
  
  @FXML
  private Button TeachersButton;
  
  @FXML
  private Button Settings;
  
  @FXML
  void handleSettingsWindowButton(ActionEvent event) {
    System.out.println("Settings");
  }
  
  @FXML
  void handleStudentWindowButton(ActionEvent event) {
    System.out.println("Student");
  
  }
  
  @FXML
  void handleTeacherWindowButton(ActionEvent event) {
    System.out.println("Teacher");
  
  }
  public void setData(){
    this.setdatalabel.setText("Hello");
  }
  
}
