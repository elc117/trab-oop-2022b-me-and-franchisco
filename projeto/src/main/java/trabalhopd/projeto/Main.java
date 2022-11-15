package trabalhopd.projeto;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Parent;

public class Main extends Application {

    private static Stage stage;

    private static Scene mainScene;
    public static Stage WINDOWS;

    private static int t;

    @Override
    public void start(Stage stage) throws Exception{

        WINDOWS = stage;

        FXMLLoader fxmlData = new FXMLLoader(Main.class.getResource("data.fxml"));
        mainScene = new Scene(fxmlData.load(), 800, 600);

        WINDOWS.setScene(mainScene);

        WINDOWS.setTitle("Tela Principal");

        WINDOWS.show();
    }
    public static void main(String[] args) {
        launch();
    }
}
/*
*
*  module trabalhopd.projeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens trabalhopd.projeto to javafx.fxml;
    exports trabalhopd.projeto;
}
* */