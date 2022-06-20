package com.example.studyjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import static java.awt.SystemColor.window;

public class ChangeStage extends Application {
    Stage window;
    Scene scene,scene2;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
         window = primaryStage;
         Label label1 = new Label("Chuyen trang");
         Button button = new Button("Click Me!");
         button.setOnAction(event -> {
             window.setScene(scene2);
         });
         VBox layout = new VBox();
         layout.getChildren().addAll(label1,button);
         scene = new Scene(layout, 300, 250);
         //Scene 2
         Button button2 = new Button("Go Back");
         button2.setOnAction(event -> {
             window.setScene(scene);
         });
         Label label2 = new Label("Tro lai");
         AnchorPane layout2 = new AnchorPane();
         layout2.getChildren().addAll(label2,button2);
         scene2 = new Scene(layout2, 400, 200);
         window.setScene(scene);
         window.show();
    }
}
