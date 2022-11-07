package trabalhopd.projeto;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class dataController {


    @FXML private TextField nome;
    @FXML private TextField Problema;
    @FXML private TextField turma;


    public void catchInfos(Event event){
        Main.changeScreen("options");
        System.out.println(nome.getText());
        System.out.println(turma.getText());
        System.out.println(Problema.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Olá " + nome.getText() + " " + "Turma: " + turma.getText() + " "  + "Apresenta: " + Problema.getText());
        alert.showAndWait();

    }
}