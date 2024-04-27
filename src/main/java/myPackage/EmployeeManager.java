package myPackage;

import java.util.ArrayList;

public class EmployeeManager {
	
	 private static ArrayList<Employee> employees;

	    public EmployeeManager() {
	        EmployeeManager.employees = new ArrayList<>();
	    }

	    public static void addEmployee(Employee employee) {
	        employees.add(employee);
	    }

		public static void removeEmployee(int id) {
			employees.removeIf(e -> e.getId() == id);
		}

	    public static Employee getEmployeeById(int id) {
	        for (Employee e : employees) {
	            if (e.getId() == id) {
	                return e;
	            }
	        }
	        return null;
	    }

	    public static int getEmployeeCount() {
	        return employees.size();
	    }

	    public boolean hasEmployee(int id) {
	        for (Employee e : employees) {
	            if (e.getId() == id) {
	                return true;
	            }
	        }
	        return false;
	    }
	    
	    public static ArrayList<Employee> getEmployees(){
	    	return EmployeeManager.employees;
	    }

}
