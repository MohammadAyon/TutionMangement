import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {
    static Stage window= new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("AllFxmlFile/LogInForm.fxml"));
        primaryStage.setTitle("Can't function properly!");
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
