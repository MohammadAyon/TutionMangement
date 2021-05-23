package Application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Main extends Application {
    static Stage window= new Stage();
    
    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AdminDashBoard.fxml")));
        
        primaryStage.setTitle("tution management system!");
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.getIcons().add(new Image("Icons.png"));
        primaryStage.show();
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
}
