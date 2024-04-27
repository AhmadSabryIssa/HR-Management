package com.ainshamsteam.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class EmployeepageController
{

    @FXML
    private Button leaveRequestButton;

    @FXML
    private Button viewDataButton;

    @FXML
    private void handleLeaveRequest(ActionEvent event)
    {
        try
        {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("leave_requests.fxml"));
            Parent root = fxmlLoader.load();

            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("leaverequests");
            secondaryStage.setScene(new Scene(root));
            secondaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void handleViewData(ActionEvent event)
    {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("viewdata.fxml"));
            Parent root = fxmlLoader.load();

            Stage secondaryStage = new Stage();
            secondaryStage.setTitle("My data");
            secondaryStage.setScene(new Scene(root));
            secondaryStage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
