

package com.example.demo1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
public class scene2Controller {
    @FXML Label name2;

    @FXML Label email2;
    @FXML Label dob2;
    @FXML Label nationality2;
    @FXML Label skill2;
    @FXML Label education2;

    @FXML Label experience2;
    @FXML private Label l;
    @FXML RadioButton r,r1,r11;
    public void displayname(String username){
        name2.setText("hello: "+username);
    }
    public void displayemail(String username){
        email2.setText("hello: "+username); }
    public void displaydob(String username){
        dob2.setText("hello: "+username); }
    public void displaynationality(String username){
        nationality2.setText("hello: "+username); }
    public void displayeducation(String username){
        education2.setText("hello: "+username); }
    public void displayskill(String username){
        skill2.setText("hello: "+username); }
    public void displayexperience(String username){
        experience2.setText("hello: "+username); }
    public void r(ActionEvent event){ if(r.isSelected()){ l.setText("r"); } else if(r1.isSelected()){ l.setText("r1"); } else if(r11.isSelected()){ l.setText("r11"); } } }