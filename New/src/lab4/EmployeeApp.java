package lab4;

public class EmployeeApp {
    public static void main(String[] args) {
        EmployeeStorage storage = new EmployeeStorage();
        EmployeeView view = new EmployeeView();

        // Adding employees
        Employee e1 = new Employee(1, "John", "Doe", "New York", 50000);
        Employee e2 = new Employee(2, "Jane", "Smith", "Chicago", 60000);

        storage.addEmployee(e1);
        storage.addEmployee(e2);

        System.out.println("== All Employees ==");
        storage.showAllEmployees();

        // Get and display one employee
        System.out.println("\n== Fetching Employee with ID 1 ==");
        view.showEmployee(storage.getEmployee(1));

        // Update salary
        storage.updateSalary(1, 55000);
        System.out.println("\n== After Salary Update ==");
        view.showEmployee(storage.getEmployee(1));

        // Delete employee
        storage.deleteEmployee(2);
        System.out.println("\n== After Deletion ==");
        storage.showAllEmployees();
    }
}
