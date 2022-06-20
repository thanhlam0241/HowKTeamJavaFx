package com.example.ImageView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class App extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        /*InputStream stream = new FileInputStream("C:\\Users\\HP PAVILION\\IdeaProjects\\Test\\src\\main\\java\\com\\example\\ImageView\\image\\3.jpg");
        Image image = new Image(stream);
        //Creating the image view
        ImageView imageView = new ImageView();
        //Setting image to the image view
        imageView.setImage(image);
        //Setting the image view parameters
        imageView.setX(10);
        imageView.setY(10);
        imageView.setFitWidth(575);
        imageView.setPreserveRatio(true);
        //Setting the Scene object
        Group root = new Group(imageView);
        Scene scene = new Scene(root, 595, 370);
        stage.setTitle("Displaying Image");
        stage.setScene(scene);
        stage.show();*/
        Parent root = FXMLLoader.load(getClass().getResource("image.fxml"));
        Scene scene = new Scene(root, 595, 370);
        stage.setTitle("Displaying Image");
        stage.setScene(scene);
        stage.show();
    }
}
