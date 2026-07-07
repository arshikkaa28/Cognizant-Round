public class EmployeeManagement {

    Employee[] employees = new Employee[10];
    int count = 0;

    // Add Employee
    public void addEmployee(Employee employee) {

        if (count < employees.length) {

            employees[count] = employee;
            count++;

            System.out.println("Employee Added");

        } else {

            System.out.println("Employee Array is Full");
        }
    }

    // Search Employee
    public void searchEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                System.out.println("Employee Found");
                employees[i].display();
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    // Traverse Employees
    public void traverseEmployees() {

        System.out.println("\nEmployee Records\n");

        for (int i = 0; i < count; i++) {

            employees[i].display();
        }
    }

    // Delete Employee
    public void deleteEmployee(int id) {

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == id) {

                for (int j = i; j < count - 1; j++) {

                    employees[j] = employees[j + 1];

                }

                employees[count - 1] = null;
                count--;

                System.out.println("Employee Deleted");
                return;
            }
        }

        System.out.println("Employee Not Found");
    }

    public static void main(String[] args) {

        EmployeeManagement obj = new EmployeeManagement();

        obj.addEmployee(new Employee(101, "Rahul", "Manager", 70000));
        obj.addEmployee(new Employee(102, "Priya", "Developer", 60000));
        obj.addEmployee(new Employee(103, "Aman", "Tester", 50000));

        obj.traverseEmployees();

        obj.searchEmployee(102);

        obj.deleteEmployee(101);

        obj.traverseEmployees();

    }
}