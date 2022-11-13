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
    @FXML private TextField Matricula;
    @FXML private TextField turma;
    @FXML public static Button NextPage;
    @FXML private Button okbtn;


    public void catchInfos(Event event){
        System.out.println(nome.getText());
        System.out.println(turma.getText());
        System.out.println(Matricula.getText());
        if (Matricula.getText().isEmpty() || turma.getText().isEmpty() || nome.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("FAVOR NÃO DEIXAR CAMPO EM BRANCO, SUJEITO A PAULADA");
            alert.showAndWait();
        }
        else if (!Matricula.getText().matches("[0-9]*")){
            Alert alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setContentText("Matricula: Apenas numeros são aceitos");
            alerta.showAndWait();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setContentText("Olá " + nome.getText() + "\n" + "Turma: " + turma.getText() + "\n" + "Matricula: " + Matricula.getText() + "\n" + "Você foi cadastrado com sucesso!");
            Aluno alunool = new Aluno(nome.getText(), turma.getText(), Matricula.getText());
            alert.showAndWait();
        }
    }

    public void NextPage(){
        Main.change(2);
    }

    public void Exit(ActionEvent actionEvent) {
        exit();
    }
}