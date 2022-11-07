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
    @FXML private Button okbtn;
    @FXML private Button cancelbtn;
    @FXML private Label teste;

    public void checkBox(Event event){
        //String t = "Esta selecionado";
        System.out.println();
        if (q1.isSelected())
            teste.setText("t");
        else
            teste.setText("Is not selected");
    }
    public void cancel(Event event){
        exit();
    }
}
