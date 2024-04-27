package myPackage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class whiteboxTestPayrollProcessor {


    @Nested
    class PayrollProcessorTest {

        private PayrollProcessor payrollProcessor;

        @BeforeEach
        public void setUp() {
            // Initialize the PayrollProcessor and EmployeeManager
            payrollProcessor = new PayrollProcessor();
            EmployeeManager employeeManager = new EmployeeManager();
        }

        @Test
        public void testCalculateTotalPayroll() {
            // Create sample employees with different salaries
            Employee emp1 = new Employee(1,"Abanoub","Samy",150000,"COO",5);
            Employee emp2 = new Employee(2,"Omar","Abdelal",140000,"Name Partner",6);
            Employee emp3 = new Employee(3,"Ahmed","Sabry",160000,"HR Manager",4);

            // Add employees to the manager
            EmployeeManager.addEmployee(emp1);
            EmployeeManager.addEmployee(emp2);
            EmployeeManager.addEmployee(emp3);

            // Calculate total payroll
            double expectedTotalPayroll = emp1.getSalary() + emp2.getSalary() + emp3.getSalary();
            double actualTotalPayroll = payrollProcessor.calculateTotalPayroll();

            assertEquals(expectedTotalPayroll, actualTotalPayroll, 0.01); // Tolerance for floating-point comparison
        }

        @Test
        public void testCalculateAfterTax() {
            // Create an employee with a known salary
            Employee emp1 = new Employee(1,"Abanoub","Samy",150000,"COO",5);
            // Apply tax calculation
            PayrollProcessor.calculateAfterTax(emp1);

            // Verify that the current balance is updated correctly
            double expectedBalance = emp1.getSalary() / 1.14; // Assuming tax rate of 14%
            assertEquals(expectedBalance, emp1.getCurrentBalance(), 0.01);
        }

        @Test
        public void testAddBonus() {
            // Create an employee with an initial balance
            Employee emp1 = new Employee(1,"Abanoub","Samy",150000,"COO",5);
            double initialBalance = emp1.getCurrentBalance();

            // Add a bonus
            double bonus = 2000;
            PayrollProcessor.addBonus(emp1, bonus);

            // Verify that the current balance increases by the bonus amount
            assertEquals(initialBalance + bonus, emp1.getCurrentBalance(), 0.01);
        }

        @Test
        public void testProcessPayroll() {
            // Create an employee with an initial balance
            Employee emp1 = new Employee(1,"Abanoub","Samy",150000,"COO",5);
            emp1.setCurrentBalance(1000); // Set an initial balance

            // Process payroll (reset balance)
            PayrollProcessor.processPayroll(emp1);

            // Verify that the current balance is reset to zero
            assertEquals(0, emp1.getCurrentBalance(), 0.01);
        }
    }

}
