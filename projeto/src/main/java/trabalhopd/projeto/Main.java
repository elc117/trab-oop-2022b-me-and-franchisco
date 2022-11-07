package trabalhopd.projeto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    private static Stage stage;

    private static Scene mainScene;
    private static Scene optionsScene;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlData = new FXMLLoader(Main.class.getResource("data.fxml"));
        //mainScene = new Scene(fxmlData.load(), 1366, 768);
        FXMLLoader fxmlOptions = new FXMLLoader(Main.class.getResource("options.fxml"));
        optionsScene = new Scene(fxmlOptions.load(), 1366, 768);
        Scene scene = new Scene(fxmlData.load(), 1366, 768);
        stage.setTitle("LoginPage");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}