package controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

/**
 * @author : Kaveesha Himasanka
 * @package : controller
 * @project : Vehicle parking system
 * Kaveesha Himasanka
 * 2022-Sep
 * @since : 0.1.0
 **/
public class LoginFormController {
    public AnchorPane loginContext;
    public TextField txtUsername;
    public PasswordField txtPassword;
    public Label lblMsg;
    public JFXButton btnCancel;

    public void btnCancelOnAction(ActionEvent actionEvent) {
        Stage stage=(Stage)btnCancel.getScene().getWindow();
        stage.close();
    }

    public void btnLoginOnAction(ActionEvent actionEvent) throws IOException {
      loginLogic();
    }

    public void goToPassword(ActionEvent actionEvent) {
        txtPassword.requestFocus();
    }

    public void loginLogic() throws IOException {
        String text = "admin";
        if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            lblMsg.setText("Please enter username and password!");
        }else if(txtUsername.getText().equalsIgnoreCase(text) & txtPassword.getText().equalsIgnoreCase(text)){
            Stage window =(Stage) loginContext.getScene().getWindow();
            window.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("../views/InParkingDetailsForm.fxml")))));
        }else{
            lblMsg.setText("Invalid username or password!");
        }
    }

    public void goToLogin(ActionEvent actionEvent) throws IOException {
       loginLogic();
    }
}
