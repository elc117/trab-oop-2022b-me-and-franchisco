package trabalhopd.projeto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;
import java.security.cert.PolicyNode;
import java.util.Objects;

public class Main extends Application {

    private static Stage stage;

    private static Scene mainScene;
    public static Stage WINDOWS;
    private static Scene optionsScene;
    private static int t;

    /*public Scene createContent_1(){
        // Conteúdo I
        FXMLLoader fxmlData = new FXMLLoader(Main.class.getResource("data.fxml"));
        mainScene = new Scene(fxmlData.load(), 1366, 768);
        return mainScene;
    }

    public Scene createContent_2() throws IOException {

        // Conteúdo II
        FXMLLoader fxmlOptions = new FXMLLoader(Main.class.getResource("options.fxml"));
        optionsScene = new Scene(fxmlOptions.load(), 1366, 768);
        return optionsScene;
    }*/
    @Override
    public void start(Stage stage) throws Exception{

        WINDOWS = stage;

        FXMLLoader fxmlData = new FXMLLoader(Main.class.getResource("data.fxml"));
        mainScene = new Scene(fxmlData.load(), 1366, 768);
        FXMLLoader fxmlOptions = new FXMLLoader(Main.class.getResource("options.fxml"));
        optionsScene = new Scene(fxmlOptions.load(), 1366, 768);

        WINDOWS.setScene(mainScene);

        WINDOWS.setTitle("Tela Principal");

        WINDOWS.show();
    }
    public static void change(int str){
        switch (str){
            case 1:
                WINDOWS.setScene(mainScene);
                WINDOWS.setTitle("Tela Principal");
                WINDOWS.show();
                break;
            case 2:
                WINDOWS.setScene(optionsScene);
                WINDOWS.setTitle("Tela Principal");
                WINDOWS.show();
                break;
        }
    }
    public static void main(String[] args) {
        launch();
    }
}