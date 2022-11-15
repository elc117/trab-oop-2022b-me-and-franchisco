package trabalhopd.projeto;

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class condicaoController {

    public static Stage WINDOWS;
    private static Scene NextScene;

    private Parent root;

    private static ArrayList<Turma> turmas;
    private static int qturmas;

    public void addAT(Aluno al){
        boolean turm = false;
        if(turmas == null){
            qturmas = 0;
            turmas = new ArrayList<Turma>();
        }
        else{
            for (Turma item : turmas) {
                System.out.println(item.getturma());
                if(item.getturma().equals(al.getturma())){
                    item.addAluno(al);
                    turm = true;
                }
            }
        }
        if(turm == false){
            turmas.add(new Turma(al.getturma(), 1));
            turmas.get(qturmas).addAluno(al);
            qturmas++;
        }
    }

    public void StartPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlOptions1 = new FXMLLoader(Main.class.getResource("data.fxml"));
        root = fxmlOptions1.load();
        WINDOWS = (Stage)((Node)event.getSource()).getScene().getWindow();
        NextScene = new Scene(root, 800, 600);
        WINDOWS.setScene(NextScene);
        WINDOWS.setTitle("Tela Principal");
        WINDOWS.show();
    }

    public void NextPage(ActionEvent event) throws IOException {
        WINDOWS = (Stage)((Node)event.getSource()).getScene().getWindow();
        FXMLLoader fxmlOptions = new FXMLLoader(Main.class.getResource("relatorio.fxml"));
        root = fxmlOptions.load();
        relatorioController relatrioctl = fxmlOptions.getController();
        relatrioctl.pontuation(turmas);
        NextScene = new Scene(root, 600, 400);
        WINDOWS.setScene(NextScene);
        WINDOWS.setTitle("Relatory");
        WINDOWS.show();
    }

}
