package com.example.ComboBox;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ComboBox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        try{
            Parent root = FXMLLoader.load(getClass().getResource("comboBox.fxml"));
            Scene scene = new Scene(root, 300, 250);
            primaryStage.setTitle("ComboBox");
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (Exception e) {
            e.printStackTrace();
        }

    }
}
