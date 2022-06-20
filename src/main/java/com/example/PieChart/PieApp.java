package com.example.PieChart;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PieApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("pie.fxml"));
        primaryStage.setTitle("Pie");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }
}
