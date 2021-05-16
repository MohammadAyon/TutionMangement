import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    static Stage window= new Stage();

    @Override
    public void start(Stage primaryStage) throws Exception{
        window=primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("AllFxmlFile/LogInForm.fxml"));
        primaryStage.setTitle("anything good");
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.sizeToScene();
        primaryStage.show();
//        FXMLLoader loader =new FXMLLoader(getClass().getResource("AllFxmlFile/AdminDashBoard.fxml"));
//        AdminDashBoardController Admin =loader.getController();
//        Pane root1 = (Pane)loader.load();
//        Stage AdminStage=new Stage();
//        Scene AdminScene=new Scene(root1);
//        AdminStage.setTitle("anything good");
//        AdminStage.setScene(AdminScene);
//        AdminStage.sizeToScene();
      //  AdminStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
}
