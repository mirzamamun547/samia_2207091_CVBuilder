

package com.example.demo1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class scene2Controller {
    @FXML
    Label name2;

    @FXML
    Label email2;
    @FXML
    Label dob2;
    @FXML
    Label nationality2;
    @FXML
    Label skill2;
    @FXML
    Label education2;
    @FXML private ImageView profileImagePreview;
    @FXML
    Label experience2;
    @FXML
    private Label l;



    public void displayname(String username) {
        name2.setText("NAME: " + username);
    }

    public void displayemail(String username) {
        email2.setText("Email: " + username);
    }

    public void displaydob(String username) {
        dob2.setText("Date of Birth: " + username);
    }

    public void displaynationality(String username) {
        nationality2.setText("Nationality: " + username);
    }

    public void displayeducation(String username) {
        education2.setText("Education: " + username);
    }

    public void displayskill(String username) {
        skill2.setText("Skills: " + username);
    }

    public void displayexperience(String username) {
        experience2.setText("Experience: " + username);
    }
    public void displayImage(Image image) {
        profileImagePreview.setImage(image);
    }
}