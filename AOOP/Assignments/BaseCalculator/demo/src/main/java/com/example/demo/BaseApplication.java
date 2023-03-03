package com.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class BaseApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BaseApplication.class.getResource("BaseConverter.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        stage.setTitle("Base Conversion Calculator");
        stage.setScene(scene);
        stage.show();
    }
  //test 2
    public static void main(String[] args) {
        launch();
    }
}