package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ErrorWindowController {
  @FXML
  private Label ErrorMessage;
  
  @FXML
  private Button closeButton;
  
  public ErrorWindowController(Label errorMessage, Button closeButton) {
    ErrorMessage = errorMessage;
    this.closeButton = closeButton;
  }
  
  
  
  @FXML
  void handleCloseButtonClick(ActionEvent event) {
    Stage ErrorWindow=(Stage)this.closeButton.getScene().getWindow();
    ErrorWindow.close();
    
  }
  public void setErrorMessage(String errorMessage){
    this.ErrorMessage.setText("hi hello error");
  }
}
