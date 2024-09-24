package appli.todolistejx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StartApplication extends Application {
    private Stage mainStage;

    @Override public void start(Stage stage) throws IOException {
        this.mainStage=stage;
        FXMLLoader fxmlLoader = new FXMLLoader(StartApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        this.mainStage.setTitle("Hello!");
        this.mainStage.setScene(scene);
        this.mainStage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}