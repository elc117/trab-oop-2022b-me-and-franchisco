package trabalhopd.projeto;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private TextField txt1;
    public void vai(Event event){
        System.out.println(txt1.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Olá " + txt1.getText());
        alert.showAndWait();

    }
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}