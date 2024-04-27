package com.ainshamsteam.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ViewDataController
{

    @FXML
    private TextField titleField;
    @FXML
    private Button dispaly;

    @FXML
    private TextField firstNameField;

    @FXML
    private TextField lastNameField;

    @FXML
    private TextField salaryField;

    @FXML
    private TextField currentBalanceField;

    @FXML
    private TextField leaveBalanceField;

    @FXML
    private TextField daysRequested;

    @FXML
    private TextField attscore;

    @FXML
    private TextField behaviorscore;

    @FXML
    private TextField workscore;

    @FXML
    private TextField appscore;
    public ViewDataController()
    {
    }

    @FXML
    private void initialize()
    {
        // Initialize the controller here, if necessary
    }

    Employee employee = EmployeeManager.getEmployeeById(Datashare.getId());
    public void getData()
    {
        titleField.setText(employee.getTitle());
        firstNameField.setText(employee.getfName());
        lastNameField.setText(employee.getlName());
        salaryField.setText(String.valueOf(employee.getSalary()));
        currentBalanceField.setText(String.valueOf(employee.getCurrentBalance()));
        leaveBalanceField.setText(String.valueOf(employee.getLeaveBalance()));
        behaviorscore.setText(String.valueOf(employee.getBehScore()));
        attscore.setText(String.valueOf(employee.getAttScore()));
        workscore.setText(String.valueOf(employee.getWorkScore()));
        appscore.setText(String.valueOf(employee.getAppScore()));
        daysRequested.setText(String.valueOf(employee.getDaysRequested()));
    }




}