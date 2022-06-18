package assignmentfxml;

import java.io.IOException;
import java.net.URL;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class AssignmentFxml extends Application {
    public static Stage window;
    @Override
    public void start(Stage primaryStage) throws IOException {
        
        URL startURL = getClass().getClassLoader().getResource("fxml/FormUI.fxml");
        GridPane root = FXMLLoader.<GridPane>load(startURL);
        
        Scene currentScene = new Scene(root);
        primaryStage.setTitle("---Assignment---");
        primaryStage.setScene(currentScene);
        primaryStage.show();
        
    }


    public static void main(String[] args) {
        launch(args);
    }
    
}
