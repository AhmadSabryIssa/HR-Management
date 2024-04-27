package com.ainshamsteam.gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginApplication extends Application
{
        @Override
        public void start(Stage stage) throws IOException
        {
            FXMLLoader fxmlLoader = new FXMLLoader(com.ainshamsteam.gui.LoginApplication.class.getResource("Login_page.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Login page");
            stage.setScene(scene);
            stage.show();
        }

        public static void main(String[] args) {
            launch();
        }
    }

