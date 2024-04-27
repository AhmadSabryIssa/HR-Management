package com.ainshamsteam.gui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:sqlserver://localhost:1433;databaseName=HRMS;encrypt=true;trustServerCertificate=true";
        String username = "sa";
        String password = "asd@1234";

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the SQL Server database.");
            Employee emp = new Employee();
            emp.setID(1);
            System.out.println(emp);

        } catch (SQLException e) {
            System.out.println("Connection failed.");
            e.printStackTrace();
        }
    }
    }
