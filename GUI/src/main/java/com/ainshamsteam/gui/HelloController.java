package com.ainshamsteam.gui;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class HelloController
{
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    private Button employeeManagementButton;
    private Button leavemanagementButton;
    private Button payrollButton;
    private Button performanceevaluations;

    @FXML
    private void EmployeeManagement(ActionEvent event)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Employee_management.fxml"));
            Parent root = fxmlLoader.load();

            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("Employee management");
            secondaryStage.setScene(new Scene(root));
            secondaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void LeaveManagement(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Leave_Management.fxml"));
            Parent root = fxmlLoader.load();

            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("Leave Management");
            secondaryStage.setScene(new Scene(root));
            secondaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  @FXML
    private void Payroll(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Payroll.fxml"));
            Parent root = fxmlLoader.load();

            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("payroll");
            secondaryStage.setScene(new Scene(root));
            secondaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }  @FXML
    private void EmployeeEvaluations(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Performance_Evaluation.fxml"));
            Parent root = fxmlLoader.load();

            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("Performance Evaluation");
            secondaryStage.setScene(new Scene(root));
            secondaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}