package com.ainshamsteam.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.TextArea;

public class EmployeemanagementController
{
 private EmployeeManager employeeManager=new EmployeeManager();
   @FXML
   private Button addEmployeeButton;

   @FXML
   private Button removeEmployeeButton;

   @FXML
   private TextField adminPrivilegesTextField;

   @FXML
   private TextArea idTextArea;

   @FXML
   private TextArea firstNameTextArea;

   @FXML
   private TextArea lastNameTextArea;

   @FXML
   private TextArea titleTextArea;

   @FXML
   private Button getEmployeeByIdButton;

   @FXML
   private TextArea idTextArea2;

   @FXML
   private TextField displayEmployeeNameTextField;

   @FXML
   private TextField displayEmployeeSalaryTextField;

   @FXML
   private TextField displayEmployeeTitleTextField;

   @FXML
   private TextArea idTextArea3;

   @FXML
   private TextArea adminPrivilegesTextArea;
    @FXML
    private TextArea setsalary;

    @FXML
    private TextArea setleavebalance;
    @FXML
    private TextField displayLastName;
    @FXML
    private TextField displayCurrentbalance;
    @FXML
    private TextField displayLeavebalance;



    @FXML
    private void addEmployee()
    {
        Employee employee=new Employee();
        employee.setfName(firstNameTextArea.getText());
        employee.setlName(lastNameTextArea.getText());
        employee.setID(Integer.parseInt(idTextArea.getText()));
        employee.setTitle(titleTextArea.getText());
        employee.setSalary(Double.parseDouble(setsalary.getText()));
        employee.setType(Boolean.parseBoolean(adminPrivilegesTextArea.getText()));
        employee.setLeaveBalance(Integer.parseInt(setleavebalance.getText()));
        EmployeeManager.addEmployee(employee);

    }


    @FXML
    private void removeEmployee()
    {

       EmployeeManager.removeEmployee(Integer.parseInt(idTextArea.getText()));
    }

    @FXML
    private void getEmployeeById()
    {


            Employee employee = EmployeeManager.getEmployeeById(Integer.parseInt(idTextArea.getText()));
            if (employee != null)
            {
                displayEmployeeNameTextField.setText(employee.getfName());
                displayEmployeeSalaryTextField.setText(String.valueOf(employee.getSalary()));
                displayEmployeeTitleTextField.setText(employee.getTitle());
                displayLastName.setText(employee.getlName());
                displayCurrentbalance.setText(String.valueOf(employee.getCurrentBalance()));
                displayLeavebalance.setText(String.valueOf(employee.getLeaveBalance()));
            }
            else {
                displayEmployeeNameTextField.setText("");
                displayEmployeeSalaryTextField.setText("");
                displayEmployeeTitleTextField.setText("");
                displayLastName.setText("");
                displayCurrentbalance.setText("");
                displayLeavebalance.setText("");
            }
        }


    }

