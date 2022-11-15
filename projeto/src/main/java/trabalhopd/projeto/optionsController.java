package trabalhopd.projeto;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

import static javafx.application.Platform.exit;


public class optionsController {

    public static Stage WINDOWS;
    private static Scene relatoryScene;
    @FXML private CheckBox q1,q2,q3,q4,q5;
    @FXML private CheckBox q11,q12,q13,q14,q15;
    @FXML private CheckBox q111,q112,q113,q114,q115;
    @FXML private CheckBox q1111,q1112,q1113,q1114,q1115;
    @FXML private Button okbtn;
    @FXML private Button cancelbtn;
    @FXML private Label teste;
    public int cont;

    private static Aluno alunes;

    public void gotaluno(Aluno a){
        alunes = a;
    }

    public void checkcheckbox(CheckBox s1, CheckBox s2, CheckBox s3, CheckBox s4, CheckBox s5){
        if (s1.isSelected()){
            if(s2.isSelected())
                s2.setSelected(false);
            else {
                if(s3.isSelected())
                    s3.setSelected(false);
                else{
                    if(s4.isSelected())
                        s4.setSelected(false);
                    else{
                        if(s5.isSelected())
                            s5.setSelected(false);
                    }
                }
            }

        }
    }

    public void checkBox1(Event event){
        //String t = "Esta selecionado";
        checkcheckbox(q1,q2,q3,q4,q5);
        checkcheckbox(q11,q12,q13,q14,q15);
        checkcheckbox(q111,q112,q113,q114,q115);
        checkcheckbox(q1111,q1112,q1113,q1114,q1115);
    }

    public void checkBox2(Event event){
        checkcheckbox(q2,q1,q3,q4,q5);
        checkcheckbox(q12,q11,q13,q14,q15);
        checkcheckbox(q112,q111,q113,q114,q115);
        checkcheckbox(q1112,q1111,q1113,q1114,q1115);
    }

    public void checkBox3(Event event){
        checkcheckbox(q3,q2,q1,q4,q5);
        checkcheckbox(q13,q12,q11,q14,q15);
        checkcheckbox(q113,q112,q111,q114,q115);
        checkcheckbox(q1113,q1112,q1111,q1114,q1115);
    }

    public void checkBox4(Event event){
        checkcheckbox(q4,q2,q3,q1,q5);
        checkcheckbox(q14,q12,q13,q11,q15);
        checkcheckbox(q114,q112,q113,q111,q115);
        checkcheckbox(q1114,q1112,q1113,q1111,q1115);
    }
    public void checkBox5(Event event) {
        checkcheckbox(q5, q2, q3, q4, q1);
        checkcheckbox(q15, q12, q13, q14, q11);
        checkcheckbox(q115, q112, q113, q114, q111);
        checkcheckbox(q1115, q1112, q1113, q1114, q1111);
    }
    public void checkpoints2(CheckBox s1, CheckBox s2, CheckBox s3, CheckBox s4, CheckBox s5){
        if (s1.isSelected()) cont+=1;
        if (s2.isSelected()) cont+=2;
        if (s3.isSelected()) cont+=3;
        if (s4.isSelected()) cont+=4;
        if (s5.isSelected()) cont+=5;

    }

    public void checkpoints(ActionEvent event) throws IOException {

        checkpoints2(q1,q2,q3,q4,q5);
        checkpoints2(q11,q12,q13,q14,q15);
        checkpoints2(q111,q112,q113,q114,q115);
        checkpoints2(q1111,q1112,q1113,q1114,q1115);
        alunes.setpontuacao(cont);
        NextPage(event);
    }

    public void cancel(Event event){
        exit();
    }
    public void NextPage(ActionEvent event) throws IOException {
        FXMLLoader fxmlconditions = new FXMLLoader(Main.class.getResource("condicao.fxml"));
        Parent root = fxmlconditions.load();
        condicaoController condctl = fxmlconditions.getController();
        condctl.addAT(alunes);
        WINDOWS = (Stage)((Node)event.getSource()).getScene().getWindow();
        relatoryScene = new Scene(root, 800, 600);
        WINDOWS.setScene(relatoryScene);
        WINDOWS.setTitle("Atualização");
        WINDOWS.show();
    }
}
