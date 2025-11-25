
package com.example.demo1;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
public class scene1Controller {

    private db db = new db();

    @FXML TextField namebutton;
    @FXML TextField emailbutton;

    @FXML TextField dobbutton;
    @FXML TextField nationalitybutton;
    @FXML TextField educationbutton;
    @FXML TextField skillsbutton;
    @FXML TextField phonebutton;
    @FXML TextField addressbutton;
    @FXML TextField projectbutton;

    @FXML TextField experiencebutton;

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML private ImageView profileImage;

    @FXML
    private void handleImageUpload() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Profile Image");
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg")
        );

        File file = fileChooser.showOpenDialog(new Stage());
        if (file != null) {
            Image image = new Image(file.toURI().toString());
            profileImage.setImage(image);
        }
    }

    public void update(ActionEvent event) throws IOException {
        db.updateData(
                namebutton.getText(),
                emailbutton.getText(),
                phonebutton.getText(),
                dobbutton.getText(),
                addressbutton.getText(),
                nationalitybutton.getText(),
                skillsbutton.getText(),
                educationbutton.getText(),
                projectbutton.getText(),
                experiencebutton.getText()
        );
        String hsername=namebutton.getText();
        String email1name=emailbutton.getText();
        String dobname=dobbutton.getText();
        String nationalityname=nationalitybutton.getText();
        String educationname=educationbutton.getText();
        String phonename=phonebutton.getText();
        String addressname=addressbutton.getText();
        String projectname=projectbutton.getText();
        String skillname=skillsbutton.getText();


        String experiencename=experiencebutton.getText();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("UpdateDelete.fxml"));
        root = loader.load();
        UpdateDeleteController scene2Controller=loader.getController();
        scene2Controller.displayname(hsername,email1name,dobname,nationalityname,educationname,phonename,addressname,projectname,skillname,experiencename);
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }



    public void delete(ActionEvent event) throws IOException {
        db.deleteData(
                namebutton.getText()
        );
    }






    public void login(ActionEvent event) throws IOException {
        db.insertData(
                namebutton.getText(),
                emailbutton.getText(),
                phonebutton.getText(),
                dobbutton.getText(),
                addressbutton.getText(),
                nationalitybutton.getText(),
                skillsbutton.getText(),
                educationbutton.getText(),
                projectbutton.getText(),
                experiencebutton.getText()
        );




        String hsername=namebutton.getText();
        String email1name=emailbutton.getText();
        String dobname=dobbutton.getText();
        String nationalityname=nationalitybutton.getText();
        String educationname=educationbutton.getText();
        String phonename=phonebutton.getText();
        String addressname=addressbutton.getText();
        String projectname=projectbutton.getText();
        String skillname=skillsbutton.getText();


        String experiencename=experiencebutton.getText();


        FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
        root = loader.load();
        scene2Controller scene2Controller=loader.getController();
        scene2Controller.displayname(hsername);
        scene2Controller.displayemail(email1name);
        scene2Controller.displaydob(dobname);
        scene2Controller.displaynationality(nationalityname);
        scene2Controller.displayeducation(educationname);
        scene2Controller.displayskill(skillname);
        scene2Controller.displayphone(phonename);
        scene2Controller.displayaddress(addressname);
        scene2Controller.displayproject(projectname);

        scene2Controller.displayexperience(experiencename);



        if (profileImage.getImage() != null) {
            scene2Controller.displayImage(profileImage.getImage());
        }
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene); stage.show();
    } }