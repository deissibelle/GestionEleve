package com.example.gestioneleve;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onConnectButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}