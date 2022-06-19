package com.example.TreeView;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class TreeView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws    Exception {
     Parent root = FXMLLoader.load(getClass().getResource("treeView.fxml"));
        primaryStage.setTitle("TreeView");
        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.show();

    }
}
