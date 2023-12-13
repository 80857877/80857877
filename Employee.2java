class Employee {
    protected double basicSalary;

    public Employee(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public void calculateTransportAllowance() {
        double transportAllowance = 10 * basicSalary / 100;
        System.out.println("Employee's Transport Allowance: " + transportAllowance);
        System.out.println("Salary after Transport Allowance: " + (basicSalary + transportAllowance));
    }
}

class Manager extends Employee {
    public Manager(double basicSalary) {
        super(basicSalary);
    }

    @Override
    public void calculateTransportAllowance() {
        double transportAllowance = 15 * basicSalary / 100;
        System.out.println("Manager's Transport Allowance: " + transportAllowance);
        System.out.println("Salary after Transport Allowance: " + (basicSalary + transportAllowance));
    }
}

class Trainee extends Employee {
    public Trainee(double basicSalary) {
        super(basicSalary);
    }
}

public class Inher {
    public static void main(String[] args) {
        // For Manager
        Manager manager = new Manager(50000); // Replace with actual salary
        System.out.println("Manager's Details:");
        manager.calculateTransportAllowance();

        System.out.println();

        // For Trainee
        Trainee trainee = new Trainee(25000); // Replace with actual salary
        System.out.println("Trainee's Details:");
        trainee.calculateTransportAllowance();
    }
}
