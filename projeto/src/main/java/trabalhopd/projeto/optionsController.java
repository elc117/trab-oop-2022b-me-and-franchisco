package trabalhopd.projeto;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import static javafx.application.Platform.exit;


public class optionsController {

    @FXML private CheckBox q1;
    @FXML private CheckBox q2;
    @FXML private CheckBox q3;
    @FXML private CheckBox q4;
    @FXML private Label teste;
    public int cont;
    public void checkBox(Event event){
        //String t = "Esta selecionado";
        System.out.println();
        if (q1.isSelected()) cont++;
        if (q2.isSelected()) cont++;
        if (q3.isSelected()) cont++;
        if (q4.isSelected()) cont++;
    }
    public void cancel(Event event){
        exit();
    }
    public void NextPage(){
        Main.change(3);
        relatorioController.Summ();
    }
}
