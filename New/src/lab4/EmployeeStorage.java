package lab4;

import java.util.*;

public class EmployeeStorage {
    private Map<Integer, Employee> employeeMap = new HashMap<>();

    public void addEmployee(Employee emp) {
        employeeMap.put(emp.getEmpNo(), emp);
    }

    public Employee getEmployee(int empNo) {
        return employeeMap.get(empNo);
    }

    public void updateSalary(int empNo, double newSalary) {
        Employee emp = employeeMap.get(empNo);
        if (emp != null) {
            employeeMap.put(empNo, new Employee(empNo, emp.getFirstName(), emp.getLastName(), emp.getCity(), newSalary));
        }
    }

    public void deleteEmployee(int empNo) {
        employeeMap.remove(empNo);
    }

    public void showAllEmployees() {
        for (Employee e : employeeMap.values()) {
            e.displayInfo();
            System.out.println("-------------------");
        }
    }
}
