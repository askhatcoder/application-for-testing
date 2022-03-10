package com.houarizegai.quizappfx.controllers;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class AboutController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    void btnClose(MouseEvent event) {
        JavaQuizController.aboutDialog.close();
    }

    @FXML
    void initialize() {

    }


    @FXML
    void goGithub() {
        try {
            Desktop.getDesktop().browse(new URI("https://www.github.com/askhatcoder"));
        } catch (URISyntaxException | IOException ex) {
            Logger.getLogger(AboutController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
