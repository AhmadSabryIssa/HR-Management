
package com.ainshamsteam.gui;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javax.lang.model.type.NullType;
import java.io.IOException;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.StackPane;
public class LoginController
{
    @FXML
    private TextArea UserID;
    @FXML
    private PasswordField Password;
    @FXML
    private CheckBox adminModeCheckBox;
    @FXML
    private Button buttonlogin;


       private void showAlert (String title, String message)
       {
           Alert alert = new Alert(AlertType.ERROR);
           alert.setTitle(title);
           alert.setHeaderText(null);
           alert.setContentText(message);
           alert.showAndWait();
       }


    @FXML
    private void homepage(ActionEvent event) throws IOException {
        if (adminModeCheckBox.isSelected())
        {
            int employeeId = Integer.parseInt(UserID.getText());
            Employee employee = EmployeeManager.getEmployeeById(employeeId);
            String employeepass=Password.getText();
            /*if (employee == null)
            {

                showAlert("Invalid Username", "The entered username is incorrect.");

            }
            if(employee.getPassword()!=employeepass)
            {
                showAlert("Invalid password", "The entered password is incorrect.");;
            }
            if(!employee.getType())
            {
                showAlert("access denied", "you do not have admin privileges.");;
            }

            else*/
            {

                try {
                    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("home_testing.fxml"));
                    Parent root = fxmlLoader.load();

                    Stage secondaryStage = new Stage();
                    secondaryStage.setTitle("Admin");
                    secondaryStage.setScene(new Scene(root));
                    secondaryStage.show();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else
        {
            if (!adminModeCheckBox.isSelected())
            {
                int employeeId = Integer.parseInt(UserID.getText());
                String employeepass=Password.getText();
                Employee employee = EmployeeManager.getEmployeeById(employeeId);
                /*if (employee == null)
                {

                    showAlert("Invalid Username", "The entered username is incorrect.");

                }
                if(employee.getPassword()!=employeepass)
                {
                    showAlert("Invalid password", "The entered password is incorrect.");;
                }


                else*/ {
                    Datashare datashare=new Datashare();
                    datashare.setId(employeeId);
                    try {
                        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Employeepage.fxml"));
                        Parent root = fxmlLoader.load();

                        Stage secondaryStage = new Stage();
                        secondaryStage.setTitle("Employee");
                        secondaryStage.setScene(new Scene(root));
                        secondaryStage.show();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }


    } }





