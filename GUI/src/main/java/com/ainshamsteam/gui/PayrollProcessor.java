package com.ainshamsteam.gui;

public class PayrollProcessor
{

	private EmployeeManager employeeManager;

	public double calculateTotalPayroll()
	{
		double totalPayroll = 0;
		for (Employee employee : employeeManager.getEmployees()) {
			totalPayroll += employee.getSalary();
		}
		return totalPayroll;
	}

	public void addBonus(Employee employee, double bonus)
	{
		employee.setCurrentBalance(employee.getCurrentBalance() + bonus);
	}

	public void processPayroll(Employee employee) {

		double tax = 1.14;
		double salaryAfterTax =  employee.getSalary() / tax;
		employee.setCurrentBalance(salaryAfterTax);

		employee.setCurrentBalance(0);

	}

}
