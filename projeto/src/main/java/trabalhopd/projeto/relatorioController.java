package trabalhopd.projeto;

import java.net.URL;
import java.util.ArrayList;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;


import java.util.ResourceBundle;

import static javafx.application.Platform.exit;

public class relatorioController {

    @FXML private static Label point1;
    @FXML private static CheckBox q1;
    @FXML private Label point2;
    private static ArrayList<Turma> turmas;

    @FXML private TreeView treeview;
/*
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        if(turmas == null)  System.out.println("krllllll");
        TreeItem<String> tree = new TreeItem<>("Turmas");
            TreeItem<String> branch;
            TreeItem<String> leaf;
            for (Turma item : turmas) {
                branch = new TreeItem<>("Turma: " + item.getturma());
                for (Aluno item2 : item.getAlunos()) {
                    leaf = new TreeItem<>(item2.getName() + ": " + item2.getpontuacao());
                    branch.getChildren().add(leaf);
                }
                tree.getChildren().add(branch);
            }
        treesView.setRoot(tree);
    }
*/
    public void loads(){
        TreeItem<String> tree = new TreeItem<>("Turmas");
        TreeItem<String> branch;
        TreeItem<String> leaf;
        for (Turma item : turmas) {
            branch = new TreeItem<>("Turma: " + item.getturma());
            for (Aluno item2 : item.getAlunos()) {
                leaf = new TreeItem<>(item2.getName() + ": " + item2.getpontuacao());
                branch.getChildren().add(leaf);
            }
            tree.getChildren().add(branch);
        }
        treeview.setRoot(tree);
    }

    //dataC
    public void pontuation(ArrayList<Turma> turm){
        turmas = turm;
    }
    public void cancel(Event event){
        exit();
    }
    //ontroller.catchInfos.alunool+

}