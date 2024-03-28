package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(getClass().getResource("gui.fxml"));

        Scene scene = new Scene(parent);

        stage.setTitle("HR app");
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void stop() {
        System.out.println("stopping!");
    }

    public static void main(String[] args) {
        launch();
    }

}