package com.example.FileChooser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class FileChooser extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("FileChooser.fxml"));
            primaryStage.setTitle("FileChooser");
            primaryStage.setScene(new Scene(root,600,500));
            primaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
