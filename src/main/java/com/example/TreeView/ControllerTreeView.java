package com.example.TreeView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;

import java.net.URL;
import java.util.ResourceBundle;

public class ControllerTreeView implements Initializable {
    @FXML
    TreeView<String> treeView;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
                 TreeItem<String> root = new TreeItem<>("Bat ngo khong thang lon");
                 TreeItem<String> javaFXTutorials = new TreeItem<>("JavaFXTutorials");
                 TreeItem<String> sample = new TreeItem<>("Sample");
                 TreeItem<String> Main8 = new TreeItem<>("Main8");
                 TreeItem<String> Main9 = new TreeItem<>("Main9");
                 TreeItem<String> Main10 = new TreeItem<>("Main10");


                 sample.getChildren().addAll(Main8, Main9, Main10);
                 javaFXTutorials.getChildren().addAll(sample);
                 root.getChildren().addAll(javaFXTutorials);

                 root.setExpanded(true);
                 javaFXTutorials.setExpanded(true);
                 sample.setExpanded(true);


                 treeView.setRoot(root);
                 treeView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> {
                     System.out.println(newValue.getValue());
                 });
    }
}
