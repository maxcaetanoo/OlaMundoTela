module org.example.olamundotela {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.olamundotela to javafx.fxml;
    exports org.example.olamundotela;
}