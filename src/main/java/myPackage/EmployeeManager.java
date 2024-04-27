package myPackage;

import java.util.ArrayList;

class EmployeeManager {
	
	 private static ArrayList<Employee> employees;

	    public EmployeeManager() {
	        EmployeeManager.employees = new ArrayList<>();
	    }

	    public static void addEmployee(Employee employee) {
	        employees.add(employee);
	    }

	    public void removeEmployee(int id) {
	        for (Employee e : employees) {
	        	if (e.getId() == id)
	        		employees.remove(e);
	        }
	    }

	    public Employee getEmployeeById(int id) {
	        for (Employee e : employees) {
	            if (e.getId() == id) {
	                return e;
	            }
	        }
	        return null;
	    }

	    public int getEmployeeCount() {
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
	    
	    public ArrayList<Employee> getEmployees(){
	    	return EmployeeManager.employees;
	    }

}
