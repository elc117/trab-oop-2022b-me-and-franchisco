package trabalhopd.projeto;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.time.chrono.MinguoChronology;

import static javafx.application.Platform.exit;

public class dataController {


    @FXML private TextField nome;
    @FXML private TextField Problema;
    @FXML private TextField turma;
    @FXML public static Button NextPage;


    public void catchInfos(Event event){
        System.out.println(nome.getText());
        System.out.println(turma.getText());
        System.out.println(Problema.getText());
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setContentText("Olá " + nome.getText() + " " + "Turma: " + turma.getText() + " "  + "Apresenta: " + Problema.getText());
        alert.showAndWait();

    }

    public void NextPage(){
        Main.change(2);
    }

    public void Exit(ActionEvent actionEvent) {
        exit();
    }
}