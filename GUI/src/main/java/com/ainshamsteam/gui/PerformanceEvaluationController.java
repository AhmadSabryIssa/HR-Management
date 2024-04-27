package com.ainshamsteam.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class PerformanceEvaluationController
{
    private PerformanceEvaluator performanceEvaluation = new PerformanceEvaluator();
    @FXML
    private TextArea enterTextArea;
    @FXML
    private TextArea attendanceTextArea;
    @FXML
    private TextArea appearanceTextArea;
    @FXML
    private TextArea workDeliveryTextArea;
    @FXML
    private TextArea behaviorTextArea;
    @FXML
    private Button calculateButton;
    @FXML
    private TextField resultTextField;
    @FXML
    private Button setButton;

    @FXML
    private void assignScores(ActionEvent event) {
        int employeeId=Integer.parseInt(this.enterTextArea.getText());
        Employee employee = EmployeeManager.getEmployeeById(employeeId);
        if (employee != null) {
            int attendance = Integer.parseInt(this.attendanceTextArea.getText());
            int appearance = Integer.parseInt(this.appearanceTextArea.getText());
            int workDelivery = Integer.parseInt(this.workDeliveryTextArea.getText());
            int behavior = Integer.parseInt(this.behaviorTextArea.getText());

            employee.addAppearance(appearance);
            employee.addAttendance(attendance);
            employee.addWork(workDelivery);
            employee.addBehavior(behavior);


        }
    }

    @FXML
    public void calculateEvaluation(ActionEvent event)
    {


        // Now you can use this employee object to perform actions like attendance calculation


        int employeeId = Integer.parseInt(enterTextArea.getText());

        // Get the attendance, appearance, work delivery, and behavior scores from the user

        // Set the scores for the employee
        Employee employee = EmployeeManager.getEmployeeById(employeeId);

        double overallScore = performanceEvaluation.calculateScore(employee);
        resultTextField.setText("Overall Score: " + overallScore + "\nPerformance Level: " + PerformanceEvaluator.determinePerformanceLevel(overallScore));

    }


    }







