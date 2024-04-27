package com.ainshamsteam.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LeaveRequestController
{

    @FXML
    private Label titleLabel;

    @FXML
    private Button displayBalanceButton;

    @FXML
    private Button requestLeaveButton;

    @FXML
    private TextField leaveBalanceTextField;

    @FXML
    private TextArea leaveRequestTextArea;

    @FXML
    private void RequestLeave(ActionEvent event)
    {
        Employee employee = EmployeeManager.getEmployeeById(Datashare.getId());
        employee.addLeave(Integer.parseInt(String.valueOf(leaveRequestTextArea)));


    }
@FXML
    private void displayBalance(ActionEvent event)
{

    Employee employee = EmployeeManager.getEmployeeById(Datashare.getId());
  leaveBalanceTextField.setText(String.valueOf(employee.getLeaveBalance()));
}
}
