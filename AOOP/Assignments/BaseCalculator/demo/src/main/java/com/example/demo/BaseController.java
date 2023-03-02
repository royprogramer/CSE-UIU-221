package com.example.demo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class BaseController {
    @FXML
    private TextField Input_Screen;
    @FXML
    private Label Output_Screen;

    public void binaryFun(ActionEvent actionEvent) {
        String str=Input_Screen.getText();
        try{
            if( str.isEmpty()||str.contains("."))
            {
                throw new Exception();
            }

                try {
                    Integer in= Integer.parseInt(str);
                    Output_Screen.setText(Integer.toBinaryString(in));
                }
                catch (Exception e)
                {
                    Output_Screen.setText("Not a Number!");
                }


        }
        catch (Exception e)
        {
            Output_Screen.setText("No Input Given");
        }


    }

    public void HexFun(ActionEvent actionEvent) {
        String str=Input_Screen.getText();
        try{
            if(str.isEmpty()||str.contains("."))
            {
                throw new Exception();
            }
            else{
                try {
                    Integer in= Integer.parseInt(str);
                    Output_Screen.setText(Integer.toHexString(in));
                }
                catch (Exception e)
                {
                    Output_Screen.setText("Not a Number!");
                }
            }

        }
        catch (Exception e)
        {
            Output_Screen.setText("No Input Given");
        }

    }

    public void OctalFun(ActionEvent actionEvent) {
        String str=Input_Screen.getText();
        try{
            if(str.isEmpty()||str.contains("."))
            {
                throw new Exception();
            }
            else{
                try {
                    Integer in= Integer.parseInt(str);
                    Output_Screen.setText(Integer.toOctalString(in));
                }
                catch (Exception e)
                {
                    Output_Screen.setText("Not a Number!");
                }
            }

        }
        catch (Exception e)
        {
            Output_Screen.setText("No Input Given");
        }

    }

    public void NextScreenFun(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("next.fxml"));
        Scene newScene = new Scene(root,600,400);
        Stage stage =(Stage)((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(newScene);
        stage.show();


    }

    public void ExitFun(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void ClearFun(ActionEvent actionEvent) {
        Input_Screen.setText("");
        Output_Screen.setText("No Input");
    }

}