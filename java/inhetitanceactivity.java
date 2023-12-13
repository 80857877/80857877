// Employee class
class Employee {
    Long employeeId;
    String employeeName;
    String employeeAddress;
    Long employeePhone;
    Double basicSalary;
    double specialAllowance = 250.80;
    double hra = 1000.50;

    // Overloaded Constructor
    Employee(Long id, String name, String address, Long phone, Double salary) {
        this.employeeId = id;
        this.employeeName = name;
        this.employeeAddress = address;
        this.employeePhone = phone;
        this.basicSalary = salary;
    }

    // Method to calculate salary
    void calculateSalary() {
        double salary = basicSalary + (basicSalary * specialAllowance / 100) + (basicSalary * hra / 100);
        System.out.println("Employee: " + employeeName + ", Salary: " + salary);
    }

    // Method to calculate transport allowance
    void calculateTransportAllowance() {
        double transportAllowance = 10 * basicSalary / 100;
        System.out.println("Employee: " + employeeName + ", Transport Allowance: " + transportAllowance);
    }
}

// Manager class extending Employee
class Manager extends Employee {
    Manager(Long id, String name, String address, Long phone, Double salary) {
        super(id, name, address, phone, salary);
    }

    // Override method to calculate transport allowance for Manager
    @Override
    void calculateTransportAllowance() {
        double transportAllowance = 15 * basicSalary / 100;
        System.out.println("Manager: " + employeeName + ", Transport Allowance: " + transportAllowance);
    }
}

// Trainee class extending Employee
class Trainee extends Employee {
    Trainee(Long id, String name, String address, Long phone, Double salary) {
        super(id, name, address, phone, salary);
    }
}

// InheritanceActivity class
public class InheritanceActivity {
    public static void main(String[] args) {
        // Test case #1 - Manager
        Manager manager = new Manager(126534L, "Peter", "Chennai India", 237844L, 65000.0);
        manager.calculateSalary(); // Calculate salary for Manager
        manager.calculateTransportAllowance(); // Calculate transport allowance for Manager

        // Test case #2 - Trainee
        Trainee trainee = new Trainee(29846L, "Jack", "Mumbai India", 442085L, 45000.0);
        trainee.calculateSalary(); // Calculate salary for Trainee
        trainee.calculateTransportAllowance(); // Calculate transport allowance for Trainee
    }
}
