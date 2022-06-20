package com.example.FileChooser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class Controller {
    @FXML
    private ImageView imageView;
    @FXML
    AnchorPane ap;
    public void ChooseImage(ActionEvent event){
        Stage stage = (Stage) ap.getScene().getWindow();
        FileChooser fc = new FileChooser();
        fc.setTitle("Choose an image");
        FileChooser.ExtensionFilter imageFilter = new FileChooser.ExtensionFilter("Image files", "*.jpg", "*.png", "*.gif");
        fc.getExtensionFilters().addAll(imageFilter);
        File file = fc.showOpenDialog(stage);
        if(file!=null){
            Image image = new Image(file.toURI().toString(),215,270,false,true);
            imageView.setImage(image);
        }


    }

}
