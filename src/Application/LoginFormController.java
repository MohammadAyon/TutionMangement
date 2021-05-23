package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import Validators.validationForLogInPage;

import java.util.Objects;

import static java.util.Objects.requireNonNull;


public class LoginFormController {

  @FXML // fx:id="UserNameText"
  private TextField UserNameText; // Value injected by FXMLLoader
  
  @FXML // fx:id="passwordholder"
  private PasswordField passwordholder; // Value injected by FXMLLoader
  
  @FXML // fx:id="LogInButton"
  private Button LogInButton; // Value injected by FXMLLoader
  
  @FXML
  public void handleLogInButton1(ActionEvent actionEvent) throws Exception {
    System.out.println("logged IN");
    System.out.println(this.UserNameText.getText()+"\n"+this.passwordholder.getText());
    String UserName= this.UserNameText.getText();
    String password=this.passwordholder.getText();
    //Validators loginChecker=validationForLogInPage.UserName(UserName,password);
    try{
     // Validators.validationForLogInPage v =new validationForLogInPage();
      //UserName(UserName,password);
      AdminStage();
    }catch (Exception e){
      Stage primaryStage = (Stage) this.LogInButton.getScene().getWindow();
      ErrorDialougeBox.ErrorDialogueDisplayer(e.getMessage(),primaryStage);
    }
    
    
  }
  @FXML
  public void initialize(){
  
  }
  public void AdminStage(){
    try {
    
      Stage stage1 = (Stage) LogInButton.getScene().getWindow();
      stage1.close();
      Stage AdminStage = new Stage();
      FXMLLoader loader = new FXMLLoader();
      Pane root1 = loader.load(requireNonNull(getClass().getResource("AdminDashBoard.fxml")).openStream());
    
      AdminStage.setScene(new Scene(root1));
      AdminStage.sizeToScene();
      AdminStage.getIcons().add(new Image("Icons.png"));
      AdminStage.showAndWait();
    
    
    
    }catch(Exception ex){
      //Stage errorStage = (Stage)this.LogInButton.getScene().getWindow();
      // ErrorDialougeBox.ErrorDialogueDisplayer(ex.getMessage(),errorStage);
      ex.printStackTrace();
    }
  }
  
}
