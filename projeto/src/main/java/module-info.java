module trabalhopd.projeto {
    requires javafx.controls;
    requires javafx.fxml;


    opens trabalhopd.projeto to javafx.fxml;
    exports trabalhopd.projeto;
}