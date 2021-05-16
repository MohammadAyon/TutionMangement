
package AllControlers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class LoginFormController {

  @FXML // fx:id="UserNameText"
  private TextField UserNameText; // Value injected by FXMLLoader
  
  @FXML // fx:id="passwordholder"
  private PasswordField passwordholder; // Value injected by FXMLLoader
  
  @FXML // fx:id="LogInButton"
  private Button LogInButton; // Value injected by FXMLLoader
  
  @FXML
  public void handleLogInButton(ActionEvent actionEvent) throws Exception {
    System.out.println("logged IN");
    System.out.println(this.UserNameText.getText()+"\n"+this.passwordholder.getText());
    FXMLLoader loader =new FXMLLoader(getClass().getResource("AllFxmlFile/AdminDashBoard.fxml"));
    AdminDashBoardController Admin =loader.getController();
    Pane root = (Pane)loader.load();
    Stage AdminStage=new Stage();
    Scene AdminScene=new Scene(root);
    AdminStage.setTitle("anything good");
    AdminStage.setScene(AdminScene);
    AdminStage.sizeToScene();
    AdminStage.show();
  
  }
  @FXML
  public void initialize(){
  
  }
  
  
  
}

