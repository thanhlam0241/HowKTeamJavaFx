package com.example.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
   /* @FXML
    Button button;*/
    @FXML
    ImageView imageView;
    public void initialize(URL url, ResourceBundle rb) {
        InputStream stream = null;
        try {
            stream = new FileInputStream("C:\\Users\\HP PAVILION\\IdeaProjects\\Test\\src\\main\\java\\com\\example\\ImageView\\image\\3.jpg");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Image image = new Image(stream);
        //Creating the image view

        //Setting image to the image view
        imageView.setImage(image);
    }

    /*public void displayImage(ActionEvent event) {
        if (imageView.isDisabled()) {
            imageView.setDisable(false);
        }
        else {
            imageView.setDisable(true);
        }
    }*/
}
