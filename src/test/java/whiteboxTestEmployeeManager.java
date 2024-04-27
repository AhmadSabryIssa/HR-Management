import myPackage.Employee;
import myPackage.EmployeeManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class whiteboxTestEmployeeManager {


    @Nested
    class EmployeeManagerTest {

        private EmployeeManager employeeManager;


        @BeforeEach
        public void setup() {
            employeeManager = new EmployeeManager();
            //C
        }

        @Test
        public void testAddEmployee() {

            Employee emp1 = new Employee(10, "Abanoub", "Samy", 150000, "COO", 10);

            employeeManager.addEmployee(emp1);
            assertEquals(1, employeeManager.getEmployeeCount());
        }

        @Test
        public void testGetEmployeeById() {

            Employee emp2 = new Employee(10, "Abanoub", "Samy", 150000, "COO", 10);
            Employee emp3 = new Employee(20, "Omar", "Abdel3al", 120000, "CEO", 15);

            employeeManager.addEmployee(emp2);
            employeeManager.addEmployee(emp3);
            Employee retrievedEmployee = employeeManager.getEmployeeById(10);
            assertEquals(emp2, retrievedEmployee);
        }

        @Test
        public void testRemoveEmployee() {

            Employee emp4 = new Employee(100, "Abanoub", "Samy", 150000, "COO", 10);
            Employee emp5 = new Employee(200, "Omar", "Abdel3al", 120000, "CEO", 15);

            employeeManager.addEmployee(emp4);
            employeeManager.addEmployee(emp5);
            employeeManager.removeEmployee(200);
            assertEquals(1, employeeManager.getEmployeeCount());
        }

        @Test
        public void testHasEmployee() {

            Employee emp6 = new Employee(10, "Abanoub", "Samy", 150000, "COO", 10);

            employeeManager.addEmployee(emp6);
            assertTrue(employeeManager.hasEmployee(10));
            assertFalse(employeeManager.hasEmployee(20));
        }

        @Test
        public void testGetEmployees() {

            Employee emp7 = new Employee(10, "Abanoub", "Samy", 150000, "COO", 10);
            Employee emp8 = new Employee(20, "Omar", "Abdel3al", 120000, "CEO", 15);
            Employee emp9 = new Employee(30, "Ahmed", "Sabry", 160000, "SQL Manager",20);


            employeeManager.addEmployee(emp7);
            employeeManager.addEmployee(emp8);
            employeeManager.addEmployee(emp9);
            ArrayList<Employee> employees = employeeManager.getEmployees();
            assertEquals(3, employees.size());
            assertTrue(employees.contains(emp7));
            assertTrue(employees.contains(emp8));
            assertTrue(employees.contains(emp9));
        }

        @Test
        public void testDemoEmployees() {

            Employee emp10 = new Employee(10, "Abanoub", "Samy", 150000, "COO", 10);
            Employee emp11 = new Employee(20, "Omar", "Abdel3al", 120000, "CEO", 15);
            Employee emp12 = new Employee(30, "Ahmed", "Sabry", 160000, "SQL Manager",20);


            employeeManager.addEmployee(emp10);
            employeeManager.addEmployee(emp11);
            employeeManager.addEmployee(emp12);
            assertEquals(3, employeeManager.getEmployeeCount());
            assertEquals(emp10, employeeManager.getEmployeeById(10));
            assertEquals(emp11, employeeManager.getEmployeeById(20));
            assertEquals(emp12, employeeManager.getEmployeeById(30));
        }
    }
}
