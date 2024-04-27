package com.ainshamsteam.gui;
import java.util.Date;

public class LeaveManager {


	public void setEmployeeLeaveBalance(Employee employee, int initialLeaveBalance) {
		employee.setLeaveBalance(initialLeaveBalance);
	}

	public void addEmployeeLeave(Employee employee, int days) {

		employee.addLeave(days);
	}

	public void rejectLeave(Employee employee) {

		employee.setCurrentLeave(0);
		employee.setDaysRequested(0);
	}

	public void acceptLeave(Employee employee) {

		employee.setCurrentLeave(employee.getDaysRequested());
		employee.addLeave(-employee.getDaysRequested());
		employee.setDaysRequested(0);

	}
}
