package com.example.demo1;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class UpdateDeleteController {

    @FXML
    private TextField update1;

    @FXML
    public void displayname(String username, String email, String phone, String address,
                            String dateofbirth, String nationality, String skill,
                            String education, String project, String experience) {

        update1.setText(
                username + " " +
                        email + " " +
                        phone + " " +
                        address + " " +
                        dateofbirth + " " +
                        nationality + " " +
                        skill + " " +
                        education + " " +
                        project + " " +
                        experience
        );
    }
}
