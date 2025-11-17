package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

public class HelloController {

    @FXML
    private void handleCreateCV(ActionEvent event) {
        try {
            Parent formRoot = FXMLLoader.load(getClass().getResource("scene1.fxml"));
            Stage stage = (Stage) ((javafx.scene.Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(formRoot));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
