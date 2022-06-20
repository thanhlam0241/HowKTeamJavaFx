package com.example.PieChart;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;


public class Controller {
  @FXML
    TextField csharp,java,python;
  @FXML
    PieChart pieChart;

  public void load(ActionEvent event){
      try {
          int csharpValue = Integer.parseInt(csharp.getText());
          int javaValue = Integer.parseInt(java.getText());
          int pythonValue = Integer.parseInt(python.getText());
            PieChart.Data Csharp = new PieChart.Data("C#", csharpValue);
            PieChart.Data Java = new PieChart.Data("Java", javaValue);
            PieChart.Data Python = new PieChart.Data("Python", pythonValue);
            pieChart.getData().clear();
            pieChart.getData().addAll(Csharp,Java, Python);
            for(PieChart.Data data : pieChart.getData()){
                data.getNode().addEventHandler(MouseEvent.MOUSE_CLICKED, event1 -> {
                    Alert alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Data");
                    alert.setContentText(data.getName() + " : " + data.getPieValue());
                    alert.show();

                });
            }
      }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

  }
}
