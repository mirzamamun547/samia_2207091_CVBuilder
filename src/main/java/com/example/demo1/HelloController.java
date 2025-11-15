package com.example.demo1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Circle mycirb;
   private double y;
public  void up(ActionEvent event){
    mycirb.setCenterX(y=-50);

}

}
