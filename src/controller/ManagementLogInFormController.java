package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class ManagementLogInFormController {
    public AnchorPane ManagementLogInContext;
    public TextField managementName;
    public TextField managementPassword;
    public Label managementLabel;
    public JFXButton btnCancel;

    public void goToTasks(ActionEvent actionEvent) throws IOException {
      loginLogic();
    }

    public void loginLogic()throws IOException {
        String text = "admin";
        if (managementPassword.getText().isEmpty() || managementName.getText().isEmpty()) {
            managementLabel.setText("Please enter username and password!");
        }else if(managementName.getText().equalsIgnoreCase(text) & managementPassword.getText().equalsIgnoreCase(text)){
            URL resource = getClass().getResource("../view/DetailsForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) ManagementLogInContext.getScene().getWindow();
            window.setScene(new Scene(load));
        }
    }


    public void goToHomePage(ActionEvent actionEvent) throws IOException {
       Stage stage=(Stage)btnCancel.getScene().getWindow();
       stage.close();
    }
    public void goToPassword(ActionEvent actionEvent) {
        managementPassword.requestFocus();
    }

    public void loginEnter(ActionEvent actionEvent) throws IOException {
        loginLogic();
    }
}
