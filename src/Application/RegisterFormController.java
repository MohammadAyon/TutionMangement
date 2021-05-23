package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class RegisterFormController {
  
  @FXML
  private TextField FirstName;
  
  @FXML
  private TextField LastNameTextField;
  
  @FXML
  private Pane LastName;
  
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
  
  }
  
}
