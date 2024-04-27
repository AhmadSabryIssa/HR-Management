package com.ainshamsteam.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class LeaveManagementController
{

    @FXML
    private TextArea employeeIdTextArea;

    @FXML
    private TextField employeeIdTextField;

    @FXML
    private Button viewLeaveRequestsButton;

    @FXML
    private Button approveLeaveRequestButton;

    @FXML
    private Button rejectLeaveButton;

@FXML
    private void ViewRequesteddays(ActionEvent event)
{

    int employeeId = Integer.parseInt(employeeIdTextArea.getText());
    Employee employee = EmployeeManager.getEmployeeById(employeeId);
    employeeIdTextField.setText(String.valueOf(employee.getDaysRequested()));
}
    private void ApproveRequesteddays(ActionEvent event)
    {

        int employeeId = Integer.parseInt(employeeIdTextArea.getText());
        Employee employee = EmployeeManager.getEmployeeById(employeeId);
        employee.getDaysRequested();
    }

    private void RejectRequesteddays(ActionEvent event)
    {

        int employeeId = Integer.parseInt(employeeIdTextArea.getText());
        Employee employee = EmployeeManager.getEmployeeById(employeeId);
        employee.getDaysRequested();
    }
}
