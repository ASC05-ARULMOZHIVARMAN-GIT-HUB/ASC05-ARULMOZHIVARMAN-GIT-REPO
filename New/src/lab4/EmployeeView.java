package lab4;

public class EmployeeView {
    public void showEmployee(Employee e) {
        if (e != null) {
            e.displayInfo();
        } else {
            System.out.println("Employee not found.");
        }
    }
}
