package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class scene1Controller {
@FXML
TextField namebutton;
    @FXML
    TextField emailbutton;
    @FXML
    TextField dobbutton;
    @FXML
    TextField nationalitybutton;
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void login(ActionEvent event) throws IOException {
      String hsername=namebutton.getText();
        String email1name=emailbutton.getText();
        String dobname=dobbutton.getText();
        String nationalityname=nationalitybutton.getText();
      FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
root = loader.load();
scene2Controller scene2Controller=loader.getController();

        scene2Controller.displayname(hsername);
        scene2Controller.displayemail(email1name);
        scene2Controller.displaydob(dobname);
        scene2Controller.displaynationality(nationalityname);


        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
       scene = new Scene(root);
       stage.setScene(scene);
       stage.show();


    }



}
