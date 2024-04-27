package myPackage;

public class PayrollProcessor
{
	
	private EmployeeManager employeeManager = new EmployeeManager();

	public static void calculateAfterTax(Employee employee)
	{
		double tax = 1.14;
		double salaryAfterTax =  employee.getSalary() / tax;
		employee.setCurrentBalance(salaryAfterTax);
	}


	public double calculateTotalPayroll()
	    {
	        double totalPayroll = 0;
	        for (Employee employee : employeeManager.getEmployees()) {
	            totalPayroll += employee.getSalary();
	        }
	        return totalPayroll;
	    }

	    public static void addBonus(Employee employee, double bonus)
	    {
	    	employee.setCurrentBalance(employee.getCurrentBalance() + bonus);
	    }
	    
	    public static void processPayroll(Employee employee) {

	    	double tax = 1.14;
	        double salaryAfterTax =  employee.getSalary() / tax;
	        employee.setCurrentBalance(salaryAfterTax);

	        employee.setCurrentBalance(0);

	    }

}