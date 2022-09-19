/**
 * @author : Kaveesha Himasanka
 * @package : PACKAGE_NAME
 * @project : Vehicle parking system
 * Kaveesha Himasanka
 * 2022-Sep
 * @since : 0.1.0
 **/

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;

public class AppInitializer extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        URL resource = getClass().getResource("views/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Scene scene=new Scene(load);
        primaryStage.setResizable(false);
        scene.getStylesheets().add("styles/style.css");
        primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Vehicle Parking System");
        primaryStage.show();
    }
}
