package trabalhopd.projeto;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;


import static javafx.application.Platform.exit;

public class relatorioController {

    @FXML private static Label point1;
    @FXML private static CheckBox q1;

    public static void Summ(){
        System.out.println(dataController.catchInfos.alunool + "AQUI");
    }

    public void cancel(Event event){
        exit();
    }


}
