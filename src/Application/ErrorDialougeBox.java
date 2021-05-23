package Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
//import AllFxmlFile.*;
import javafx.stage.Stage;

import java.io.IOException;

import static java.util.Objects.requireNonNull;

public class ErrorDialougeBox {
 // private static Scene errorViewScene;
  
  public static void ErrorDialogueDisplayer (String errorMessage, Stage primaryStage){
//    FXMLLoader loader= new FXMLLoader(ErrorDialougeBox.class.getResource("AllFxmlFile.ErrorWindow.fxml"));
    try {
      FXMLLoader loader = new FXMLLoader();
      Pane root = loader.load(requireNonNull(ErrorDialougeBox.class.getResource("AdminDashBoard.fxml")).openStream());
      //ErrorWindowController errorWindow=loader.getController();
     // errorWindow.setErrorMessage(errorMessage);
      Stage stage = new Stage();
      Scene errorViewScene = new Scene(root);
      stage.setScene(errorViewScene);
     // primaryStage.initOwner(stage);
      stage.initModality(Modality.APPLICATION_MODAL);
      stage.setTitle("Error!");
      stage.showAndWait();
      
    } catch (IOException e) {
      e.printStackTrace();
      System.out.println("hi");
    }
  
  }
  
}
