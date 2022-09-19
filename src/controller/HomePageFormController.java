package controller;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author : Kaveesha Himasanka
 * @package : controller
 * @project : Vehicle parking system
 * Kaveesha Himasanka
 * 2022-Sep
 * @since : 0.1.0
 **/
public class HomePageFormController {
    public ComboBox cmbDriver;
    public ComboBox cmbVehicle;
    public Label lblVehicle;
    public AnchorPane HomeContext;
    public Text lblSlotNumber;
    public Label lblDate;
    public Label lblTime;

    public void initialize() {
        setTimeToLbl();
        showDate();
    }

    private void setTimeToLbl() {
        final Thread thread = new Thread(() -> {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("h:mm aa ");
            while (true) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                final String times = simpleDateFormat.format(new Date());
                Platform.runLater(() -> {
                    lblTime.setText(times);
                });
            }
        });
        thread.start();
    }

    private void showDate() {

        Timeline clock = new Timeline(new KeyFrame(Duration.ZERO, e -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            lblDate.setText(LocalDateTime.now().format(formatter));
        }), new KeyFrame(Duration.seconds(1)));
        clock.setCycleCount(Animation.INDEFINITE);
        clock.play();
    }

    public void btnParkOnAction(ActionEvent actionEvent) {
    }

    public void btnDeliverOnAction(ActionEvent actionEvent) {
    }

    public void btnLogInOnAction(ActionEvent actionEvent) {
    }
}
