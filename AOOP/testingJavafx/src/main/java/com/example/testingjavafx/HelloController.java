package com.example.testingjavafx;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Pane loginpane;

    @FXML
    private Pane regiplane;

    @FXML
    private Button loginButton;

    private TranslateTransition transition;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Create a TranslateTransition to animate the transition between the planes
        transition = new TranslateTransition(Duration.seconds(1), loginpane);
        transition.setToX(regiplane.getLayoutX() - loginpane.getLayoutX());
        transition.play();
    }

    @FXML
    private void handleLoginButtonAction() {
        // Set the visibility of the login pane to false and the registration pane to true
        loginpane.setVisible(false);
        regiplane.setVisible(true);

        // Animate the transition from the login pane to the registration pane
        transition.setNode(loginpane);
        transition.setToX(regiplane.getLayoutX() - loginpane.getLayoutX());
        transition.setOnFinished(event -> {
            // Reset the position of the login pane to its original position
            loginpane.setTranslateX(0);
        });
        transition.play();
    }
}
