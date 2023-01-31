module com.example.gestioneleve {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gestioneleve to javafx.fxml;
    exports com.example.gestioneleve;
}