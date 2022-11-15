package trabalhopd.projeto;

import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.chrono.MinguoChronology;
import static javafx.application.Platform.exit;

public class dataController {
    private Parent root;

    private static Scene optionsScene;
    @FXML private  TextField nome;
    @FXML private TextField Matricula;
    @FXML private TextField turma;
    @FXML public static Button NextPage;
    @FXML private Button okbtn;
    private Aluno alunoss;

    public void NextPage(ActionEvent event) throws IOException {

        FXMLLoader fxmlOptions = new FXMLLoader(Main.class.getResource("options.fxml"));
        root = fxmlOptions.load();
        optionsController datacon = fxmlOptions.getController();
        datacon.gotaluno(alunoss);
        Stage WINDOWS = (Stage) ((Node) event.getSource()).getScene().getWindow();
        optionsScene = new Scene(root, 800, 600);
        WINDOWS.setScene(optionsScene);
        WINDOWS.setTitle("Menu de Seleção");
        WINDOWS.show();

    }

    public void catchInfos(Event event) {
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
            alunoss = new Aluno(nome.getText(), turma.getText(), Matricula.getText());


            alert.showAndWait();
        }
    }

    public void Exit(ActionEvent actionEvent) {
        exit();
    }
}