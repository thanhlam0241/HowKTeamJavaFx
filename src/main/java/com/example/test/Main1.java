package com.example.studyjavafx;

import com.dlsc.formsfx.model.structure.Group;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.*;

import java.util.Objects;

public class Main1 extends Application  {
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
       /* primaryStage.setTitle("Hello World!");

        button = new Button("Say Hello World!");
        button.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
        });
        StackPane layout = new StackPane();
        layout.getChildren().addAll(button);
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();*/
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);

        primaryStage.show();

    }


}
