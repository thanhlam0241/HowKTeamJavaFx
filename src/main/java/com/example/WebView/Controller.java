package com.example.WebView;

import javafx.concurrent.Worker;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.web.WebEngine;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.web.WebView;


public class Controller implements Initializable {
    @FXML
    private WebView webView;
    @FXML
    private TextField addressBar;
    private WebEngine engine;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
      engine = webView.getEngine();
      engine.getLoadWorker().stateProperty().addListener(((observable, oldState, newState) ->{
          if(newState == Worker.State.SUCCEEDED){
              addressBar.setText(engine.getLocation().substring(8));
          }
      }));

    }
    public void KeyHandle(KeyEvent key){
        if(key.getCode().equals(KeyCode.ENTER)){
            if(addressBar.getText().substring(0,7).equals("http://")){
                engine.load(addressBar.getText());
            }
            else {
                String address ="http://"+ addressBar.getText();
                engine.load(address);
            }

        }
    }
    //go back
    public void backHandle(ActionEvent event){
        if(engine.getHistory().getCurrentIndex() > 0){
            engine.getHistory().go(-1);
        }
    }
    public void forwardHandle(ActionEvent event){
        if(engine.getHistory().getCurrentIndex()+1 < engine.getHistory().getEntries().size()){
            engine.getHistory().go(1);
        }
    }
}
