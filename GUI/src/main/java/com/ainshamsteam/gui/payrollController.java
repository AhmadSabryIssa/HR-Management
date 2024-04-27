package com.ainshamsteam.gui;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class payrollController
{
    private PayrollProcessor payrollProcessor=new PayrollProcessor();
    @FXML
    private TextArea employeeIdField;
    @FXML
    private TextField Balance;
    @FXML
    private TextArea deductionarea;

    @FXML
    private TextArea bonusField;




    @FXML
  private Button bonus;
    @FXML
    private Button deduction;
    @FXML
    private Button payroll;
    @FXML
    private Button balancedisplay;


@FXML
    private void calculateBonus()
{
        int employeeId = Integer.parseInt(employeeIdField.getText());
        Employee employee = EmployeeManager.getEmployeeById(employeeId);
        double bonus = Double.parseDouble(bonusField.getText());
        payrollProcessor.addBonus(employee, bonus);
        bonusField.setText(String.valueOf(employee.getCurrentBalance()));
    }
    @FXML
    private void calculateDeduction() {
        int employeeId = Integer.parseInt(employeeIdField.getText());
        Employee employee = EmployeeManager.getEmployeeById(employeeId);
        double bonus = Double.parseDouble(bonusField.getText());
        payrollProcessor.addBonus(employee, -bonus);
        deductionarea.setText(String.valueOf(employee.getCurrentBalance()));
    }

    @FXML
    private void processPayroll()
    {
        int employeeId = Integer.parseInt(employeeIdField.getText());
        Employee employee = EmployeeManager.getEmployeeById(employeeId);
        payrollProcessor.processPayroll(employee);

    }
    @FXML
    private void getBalance ()
    {
        int employeeId = Integer.parseInt(employeeIdField.getText());
        Employee employee = EmployeeManager.getEmployeeById(employeeId);
        Balance.setText(String.valueOf(employee.getCurrentBalance()));
    }


}
