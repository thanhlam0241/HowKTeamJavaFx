package com.example.studyjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Checkbox extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
       Label label = new Label();
       CheckBox checkbox1 = new CheckBox("Java");
       CheckBox checkbox2 = new CheckBox("C++");
       CheckBox checkbox3 = new CheckBox("C#");
       checkbox1.setSelected(true);
       Button button = new Button("Submit");
       button.setOnAction(event -> {
           String message = "Your language is: ";
           if (checkbox1.isSelected()) {
               message += checkbox1.getText() + " ";
           }
           if(checkbox2.isSelected()) {
               message += checkbox2.getText() + " ";
           }
              if(checkbox3.isSelected()) {
                message += checkbox3.getText() + " ";
              }
           System.out.println(message);

       });
       HBox layoutH = new HBox();
       layoutH.getChildren().addAll(checkbox1,checkbox2,checkbox3,button);
       VBox layoutV = new VBox();
         layoutV.getChildren().addAll(label,layoutH);
         Scene scene = new Scene(layoutV, 300, 250);
            primaryStage.setScene(scene);
            primaryStage.show();
    }
}
