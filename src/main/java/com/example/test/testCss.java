package com.example.test;

import javafx.scene.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;

import java.io.IOException;

public class testCss extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
           try {
               Parent root = FXMLLoader.load(getClass().getResource("testCss.fxml"));
               Scene scene = new Scene(root);
               /*scene.getStylesheets().add(getClass().getResource("testCss.css").toExternalForm());*/
               primaryStage.setTitle("Hello World!");
                primaryStage.setScene(scene);
                primaryStage.show();
           }
              catch (IOException e) {
                System.out.println(e.getMessage());
              }

    }
}
